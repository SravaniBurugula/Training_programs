package com.ibm.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class BeanConfig {
	@Bean
	public TextEditor textEditor() {
		return new TextEditor();
	}
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
	

}
