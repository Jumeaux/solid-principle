package com.hassane.dependencyinversionprinciple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hassane.dependencyinversionprinciple.without.NotificationService;

@SpringBootApplication
public class DependencyinversionprincipleApplication {

	public static void main(String[] args) {
	
			NotificationService notificationService= new NotificationService();
			notificationService.notifyUser("+2246257888", "Hello !");

			SpringApplication.run(DependencyinversionprincipleApplication.class, args);
	}

}
