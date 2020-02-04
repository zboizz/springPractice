package com.bit.myapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*@Getter @Setter @ToString*/
	@Data
	public class MemberDto {
		 
		private String id;
		private String pwd;
		private String name;
		private String email;		
}
