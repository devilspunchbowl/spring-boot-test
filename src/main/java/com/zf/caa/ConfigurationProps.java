package com.zf.caa;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ConfigurationProps {
	
	@Override
	public String toString() {
		return "ConfigurationProps [test=" + test + ", age=" + age + "]";
	}

	private String test;
	@NotNull(message="Please provide a age")	
	private Number age;
	
	

	public ConfigurationProps() {
		// TODO Auto-generated constructor stub
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
