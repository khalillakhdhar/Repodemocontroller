package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mvc.entities.Employee;
import com.mvc.repository.EmployeeRepository;

@SpringBootApplication
public class RepodemoApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RepodemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	Employee emp1=new Employee(0, "test", "teste", 30);
		employeeRepository.save(emp1);
		Employee emp2=new Employee(0, "test2", "teste2", 33);
employeeRepository.save(emp2);
		employeeRepository.findAll().forEach(emp->
		{
			System.out.print(emp.toString());
		});
		*/
	}

}
