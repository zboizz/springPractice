package com.bit.myapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.myapp.dto.MemberDto;

@Controller
public class MemberController {

	@RequestMapping(value="member/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(value="member/confirmId")
	public String confirmId(HttpServletRequest req, Model model) {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		return "member/confirmId"; //member/confirmId.jsp Ȯ��
	}
	
	@RequestMapping(value="member/confirmId1")
	public String confirmId(@RequestParam("id") String id,
			@RequestParam("pwd") String pwd, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		return "member/confirmId"; //member/confirmId.jsp Ȯ��
	}
	
	@RequestMapping(value="member/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping(value="member/join")
	public String join(@RequestParam("id")String id,
					   @RequestParam("pwd")String pwd,
					   @RequestParam("name")String name,
					   @RequestParam("email")String email, Model model) {
		MemberDto dto = new MemberDto(); //dto����
		//dto�� id, pwd, name, email ������ ����ֱ�
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setEmail(email);
		model.addAttribute("member",dto);//member��� ������ dto�� �����͸� �ְڴ�.
		
		return "member/join"; //member/join.jsp
	}
	@RequestMapping(value="member/join1")
	//1. JSP���� MemberDto�� �����´�.(�ڵ������� setter ȣ�Ⱚ�� ����)
	//2. model.addAttribute("member",member)
	public String join1(@ModelAttribute("member")
						MemberDto member) {
		
		return "member/join";
	}
	
	//member/student/aaa/1234567
	@RequestMapping(value= "member/student/{studentId}/{num}")
	public String student(@PathVariable String studentId, @PathVariable int num, Model model) {
		model.addAttribute("studentId", studentId);
		model.addAttribute("num",num);
		return "member/student";//member/student.jsp
	}
	
	@RequestMapping("member/getPostForm")
	public String getPostForm(){
		
		//WEB-INF/views/member/getPostForm.jsp ȣ��
		return "member/getPostForm";
	}
	
	@RequestMapping(value= "member/goGet" , method=RequestMethod.GET)
	public String goStudent(HttpServletRequest req, Model model) {
		String id=req.getParameter("id");
		model.addAttribute("id",id);
				
		return "member/goGet";
	}
	
	@RequestMapping(value="member/goPost", method=RequestMethod.POST)
	public ModelAndView goStudent(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView();
		String id = req.getParameter("id");
		mv.addObject("id",id);
		mv.setViewName("member/getGet");
		return mv;			
		}
	}





















