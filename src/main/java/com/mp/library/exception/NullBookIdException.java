package com.mp.library.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NullBookIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1936364925718530678L;
	private String message;
	
}
