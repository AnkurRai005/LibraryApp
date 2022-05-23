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
public class StringOutOfBoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8112649868937668013L;
	private String message;
}
