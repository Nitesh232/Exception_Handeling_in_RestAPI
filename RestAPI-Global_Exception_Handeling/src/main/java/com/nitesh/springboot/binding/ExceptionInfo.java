package com.nitesh.springboot.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionInfo {

	private String message;
	
	private String code;
	
}
