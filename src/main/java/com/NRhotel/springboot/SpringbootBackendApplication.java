package com.NRhotel.springboot;

import com.NRhotel.springboot.model.Employee;
import com.NRhotel.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		//Employee employee = new Employee();
		//employee.setFirstname("Ramu");
		//employee.setLastname("Ravalavalasa");
		//employee.setEmailId("ramu9@gmail.com");
		//employeeRepository.save(employee);

		//Employee employee1 = new Employee();
		//employee1.setFirstname("Naveen");
		//employee1.setLastname("Ravalavalasa");
		//employee1.setEmailId("naveen5@gmail.com");
		//employeeRepository.save(employee1);
	}
}
