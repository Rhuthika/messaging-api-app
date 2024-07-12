package com.training2.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	public void printGreeting()
	{
		System.out.println("Hi oracle");
	}

	public static void main(String[] args) {
		MessagingApiAppApplication m=new MessagingApiAppApplication();
		SpringApplication.run(MessagingApiAppApplication.class, args);
		m.printGreeting();
	}

}
