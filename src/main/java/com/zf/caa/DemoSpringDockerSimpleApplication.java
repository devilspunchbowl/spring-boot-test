package com.zf.caa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringDockerSimpleApplication {
	
	
	private static final Logger log = LoggerFactory.getLogger(DemoSpringDockerSimpleApplication.class);

	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDockerSimpleApplication.class, args);	
		
	}
}
