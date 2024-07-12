package com.training2.bms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	@GetMapping("greeting")
	public void printGreeting()
	{
		System.out.println("Rhuthika");
	}

	public static void main(String[] args) {
		MessagingApiAppApplication m=new MessagingApiAppApplication();
		SpringApplication.run(MessagingApiAppApplication.class, args);
		m.printGreeting();
	}

}
