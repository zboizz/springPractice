package com.bit.springBoard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.bit.springBoard.dto.BoardDto;

public class BoardDao {
	
	DataSource ds;
	//server.xml datasource Rink�� �س��ұ⶧���� ����
	
	public BoardDao() {
		try {
			Context context = new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//insert
	public void write(String bName, String bTitle, String bContent) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ds.getConnection();
			String sql = "insert into tblBoard (bId, bName, bTitle, bContent, bHit) "
					   + "values (tblBoardSeq.nextval, ?, ?, ?, 0)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bName);
			pstmt.setString(2, bTitle);
			pstmt.setString(3, bContent);
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null) pstmt.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}	
	
	//list
	public ArrayList<BoardDto> list(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();
		ResultSet rs = null;
		try {
			con=ds.getConnection();
			String sql="select * from tblBoard order by bId";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		while(rs.next()) {
			int bId = rs.getInt("bId");
			String bName = rs.getString("bName");
			String bTitle = rs.getString("bTitle");
			String bContent = rs.getString("bContent");
			Timestamp bDate = rs.getTimestamp("bDate");
			int bHit = rs.getInt("bHit");
			BoardDto dto = new BoardDto(bId, bName, bTitle, bContent, bDate, bHit);
			dtos.add(dto);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}return dtos;
	}
	
	//contentView
			public BoardDto contentView(int bId) {
				upHit(bId);
				BoardDto dto = null;
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				try {
					con = ds.getConnection();
					String sql = "select * from tblBoard where bId = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, bId);
					rs = pstmt.executeQuery();
					if(rs.next()) {				
						String bName = rs.getString("bName");
						String bTitle = rs.getString("bTitle");
						String bContent = rs.getString("bContent");
						Timestamp bDate = rs.getTimestamp("bDate");
						int bHit = rs.getInt("bHit");
						dto = 
						new BoardDto(bId,
								bName, bTitle, bContent, bDate, bHit);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						if (rs != null)
							rs.close();
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				return dto;
			}
			
			//modify
			public void modify(String bId, String bName, String bTitle, String bContent) {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = ds.getConnection();
					String sql = "update tblBoard set bName = ?, bTitle = ?, bContent = ? where bId = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, bName);
					pstmt.setString(2, bTitle);
					pstmt.setString(3, bContent);
					pstmt.setInt(4, Integer.parseInt(bId));
					pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
			//delete
			public void delete(String bId) {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = ds.getConnection();
					String sql = "delete from tblBoard where bId = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, Integer.parseInt(bId));
					pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
			
			//upHit
			private void upHit(int bId) {
				Connection con = null;
				PreparedStatement pstmt = null;
				try {
					con = ds.getConnection();
					String sql = "update tblBoard set bHit = bHit + 1 where bId = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, bId);
					pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (pstmt != null)
							pstmt.close();
						if (con != null)
							con.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
	}