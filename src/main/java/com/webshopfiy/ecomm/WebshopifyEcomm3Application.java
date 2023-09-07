package com.webshopfiy.ecomm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class WebshopifyEcomm3Application {
	
	public static Logger log=  LoggerFactory.getLogger(WebshopifyEcomm3Application.class);  
	
	@PostConstruct 
	public void intt()
	{
		log.info("!!started!!!");	
		log.info("!!started!!!");	
	}

	public static void main(String[] args) {
		SpringApplication.run(WebshopifyEcomm3Application.class, args);
	}

}
