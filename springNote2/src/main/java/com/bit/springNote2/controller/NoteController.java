package com.bit.springNote2.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springNote2.dao.IDao;

@Controller
public class NoteController {

	@Autowired //林涝, 狼档等 按眉 积己
	private SqlSession SqlSession;
	
	@RequestMapping(value="noteForm")
	public String noteForm() {
		return "noteForm";
	}
	
	@RequestMapping(value="write")
	public String write(HttpServletRequest req, Model model) {
		IDao dao = SqlSession.getMapper(IDao.class);
		dao.writeDao(req.getParameter("writer"), 
					 req.getParameter("content"));
		return "redirect:list";		
	}
	
	@RequestMapping(value="list")
	public String list(Model model) {
		IDao dao = SqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.listDao());
		
		return "noteList";
	}
	@RequestMapping(value="delete")
	 public String delete(HttpServletRequest req, Model model) {
		IDao dao = SqlSession.getMapper(IDao.class);
		dao.deleteDao(req.getParameter("id"));
		return "redirect:list";
	}
}
















