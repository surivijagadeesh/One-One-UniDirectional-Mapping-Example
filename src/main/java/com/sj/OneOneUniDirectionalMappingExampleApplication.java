package com.sj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sj.entity.Employee;
import com.sj.entity.Task;
import com.sj.repository.EmployeeRepository;

@SpringBootApplication
public class OneOneUniDirectionalMappingExampleApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(OneOneUniDirectionalMappingExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee1 =new Employee("Charan");
		Employee employee2 =new Employee("teja");
		
		Task task1=new Task("System not Working is assigned to Teja");
		Task task2=new Task("Login Issues is assigned to Charan");		
		
		employee1.setTask(task2);
		employee2.setTask(task1);
		
		repository.save(employee1);
		repository.save(employee2);
	}

}
