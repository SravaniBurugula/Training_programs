package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor() {
		
	}
	public TextEditor(SpellChecker spellChecker) {
	System.out.println("Inside TextEditor");
	this.spellChecker=spellChecker;
	}
	public void spellChecker() {
		spellChecker.checkSpelling();
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
}
