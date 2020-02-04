package com.bit.springNote2.dao;

import java.util.ArrayList;

import com.bit.springNote2.dto.Note2Dto;

public interface IDao {
		
		public ArrayList<Note2Dto> listDao();
		public void writeDao(String writer, String content);
		public void deleteDao(String id);
	}

