package com.nimap.customexception;

public class NoCategoeyIdFound extends RuntimeException {
	private static final long serialVersionUID = -4667620469770761205L;

	public NoCategoeyIdFound(String msg) {
		super(msg);
	}
}