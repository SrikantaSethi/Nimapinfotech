package com.nimap.customexception;

public class NoProductIdFound extends RuntimeException {
	private static final long serialVersionUID = -6509176039589282158L;

	public NoProductIdFound(String msg) {
		super(msg);
	}
}
