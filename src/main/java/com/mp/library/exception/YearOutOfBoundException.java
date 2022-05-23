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
public class YearOutOfBoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4409912061663887304L;
	private String message;
}
