package com.ibm.spring;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor() {
		
	}
	public TextEditor(SpellChecker spellChecker) {
	System.out.println("Inside TextEditor");
	this.spellChecker=spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
}
