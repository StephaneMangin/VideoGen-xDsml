package org.irisa.diverse.videogen.videoGen.aspects.exceptions;


public enum ConstraintsType {
	MIN_DURATION("Error on minimum duration constraints"),
	MAX_DURATION("Error on maximum duration constraints");
	
	private String message;

	ConstraintsType(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
