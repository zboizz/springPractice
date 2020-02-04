package com.bit.springBoard2.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springBoard2.dao.IDao;

@Controller
public class BoardController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "writeView")
	public String writeView() {
		return "writeView";
	}
	
	@RequestMapping(value = "list")
	public String list(Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list",dao.listDao());
		return "list";
	}
	
	@RequestMapping(value = "contentView")
	public String contentView(int id, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHitDao(id);
		model.addAttribute("contentView", dao.contentViewDao(id));
		return "contentView";
	}
	
	@RequestMapping(value = "write")
	public String write(String name, String title, String content) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.writeDao(name, title, content);
		return "redirect:list";
	}
	
	@RequestMapping(value = "modify")
	public String modify(String name, String title, String content, int id) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modifyDao(name, title, content, id);
		return "redirect:list";
	}
	
	@RequestMapping(value = "delete")
	public String delete(int id) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.deleteDao(id);
		return "redirect:list";
	}

}









