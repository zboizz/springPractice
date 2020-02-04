package com.bit.springBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import com.bit.springBoard.dao.BoardDao;

public class BoardDeleteCommand implements BoardCommand{
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = 
				(HttpServletRequest)map.get("request");
		String bId = req.getParameter("bId");
		BoardDao dao = new BoardDao();
		dao.delete(bId);
	}
}





