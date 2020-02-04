package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;

public class BoardModifyCommand implements BoardCommand{
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = 
				(HttpServletRequest)map.get("request");
		String bId = req.getParameter("bId");
		String bName = req.getParameter("bName");
		String bTitle = req.getParameter("bTitle");
		String bContent = req.getParameter("bContent");
		
		BoardDao dao = new BoardDao();
		dao.modify(bId, bName, bTitle, bContent);
	}
}









