package com.zf.caa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
public class Configuration {

	@Value("${test}")	
	private String test="";
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public Configuration() {
		// TODO Auto-generated constructor stub
	}

}
