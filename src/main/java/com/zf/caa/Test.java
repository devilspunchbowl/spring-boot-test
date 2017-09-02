package com.zf.caa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Test {

	
	
	private static final Logger log = LoggerFactory.getLogger(Test.class);

	
	public Test(Configuration config, ConfigurationProps configProps) {
		log.info(config.getTest());
		log.info(configProps.toString());

	}
	
	

}
