package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.ScheduledTask;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MovieBookingApplication {

	public static void main(String[] args) {
		 Object[] sources = {ApplicationArguments.class, ScheduledTask.class};
		SpringApplication.run(MovieBookingApplication.class, args);
	}

}
