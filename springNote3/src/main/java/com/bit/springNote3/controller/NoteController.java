package com.bit.springNote3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.springNote3.dao.NoteDao;

	@Controller
public class NoteController {
		private NoteDao dao;
		
		@Autowired
		public void setDao(NoteDao dao) {
			this.dao = dao;
		}
		
		@RequestMapping(value="noteForm")
		public String noteForm() {
			return "noteForm";
		}
		
		@RequestMapping(value = "write")
		//form에 변수명만 동일하면 자동적으로 주입이 가능하다.
		public String write(String writer, String content) {
			dao.write(writer, content);
			return "redirect:list";
		}
		
		@RequestMapping(value = "list")
		public String list(Model model) {
			model.addAttribute("list",dao.list());
			return "noteList";
		}
		
		@RequestMapping(value="delete")
		public String delete(int id) {
			dao.delete(id);
			return "redirect:list";
		}
		
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	