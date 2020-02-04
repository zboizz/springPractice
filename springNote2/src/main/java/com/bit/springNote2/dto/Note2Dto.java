package com.bit.springNote2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note2Dto {
	private int id;
	private String writer;
	private String content;
}