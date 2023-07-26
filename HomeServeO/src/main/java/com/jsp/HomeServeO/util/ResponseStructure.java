package com.jsp.HomeServeO.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	private String message;
	private int status;
	private T data; // it will accept t type of data 

}
