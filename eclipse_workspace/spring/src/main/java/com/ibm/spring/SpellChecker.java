package com.ibm.spring;

public class SpellChecker {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SpellChecker() {
		System.out.println("Inside SpellCheck");
	}
	public void checkSpelling() {
		System.out.println("Inside CheckSpelling");
	}

}
