package com.javacase.sagar;

public class Triangle {
	
	private String type;
	private String height;
	
	public Triangle(String type, String height) {
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(type+" Triangle shape drawn of height "+height);
	}

}
