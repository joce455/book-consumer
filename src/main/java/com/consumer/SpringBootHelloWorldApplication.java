package com.consumer;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.consumer.controller.ConsumerControllerBook;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);
		
		ConsumerControllerBook consumerControllerBook=ctx.getBean(ConsumerControllerBook.class);
		System.out.println(consumerControllerBook);
		consumerControllerBook.getBook();
	}
	
	@Bean
	public  ConsumerControllerBook  consumerControllerBook()
	{
		return  new ConsumerControllerBook();
	}
}
