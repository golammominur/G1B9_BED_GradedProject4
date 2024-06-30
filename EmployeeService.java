package com.greatLearning.employeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.greatLearning.employeeService"})
public class EmployeeService { 

	public static void main(String[] args) {
		SpringApplication.run(EmployeeService.class, args);
	}
}
