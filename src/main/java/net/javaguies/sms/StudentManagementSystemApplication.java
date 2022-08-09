package net.javaguies.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println("Application has started");
		SpringApplication.run(StudentManagementSystemApplication.class, args);
		System.out.println("Application has exited");
	}

}
