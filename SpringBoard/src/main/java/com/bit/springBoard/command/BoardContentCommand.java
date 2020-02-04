package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.bit.springBoard.dao.BoardDao;
import com.bit.springBoard.dto.BoardDto;

public class BoardContentCommand implements BoardCommand{
	
	@Override //MVC1 -> JSP ,Beans, Msg
	//MVC2 -> model 
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = 
				(HttpServletRequest)map.get("request");
		int bId = Integer.parseInt(req.getParameter("bId"));
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.contentView(bId);
		model.addAttribute("contentView", dto);
	}
}












