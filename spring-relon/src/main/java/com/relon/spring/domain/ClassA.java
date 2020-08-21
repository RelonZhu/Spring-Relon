package com.relon.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
