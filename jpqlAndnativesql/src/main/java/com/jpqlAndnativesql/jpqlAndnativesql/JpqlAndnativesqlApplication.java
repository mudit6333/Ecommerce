package com.jpqlAndnativesql.jpqlAndnativesql;

import com.jpqlAndnativesql.jpqlAndnativesql.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpqlAndnativesqlApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(JpqlAndnativesqlApplication.class, args);
		EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
		//employeeService.findAllAboveAvg();
		//employeeService.updateBelowAvgEmpSalary(15000);
		//employeeService.deleteEmployeeMinSalary();
		//employeeService.getAllEmpNameEndsWith();
		employeeService.deleteEmployeeAgeGreaterThan(45);

	}

}
