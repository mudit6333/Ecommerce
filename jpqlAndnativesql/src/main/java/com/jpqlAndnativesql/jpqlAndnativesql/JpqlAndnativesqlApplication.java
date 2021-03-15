package com.jpqlAndnativesql.jpqlAndnativesql;

import com.jpqlAndnativesql.jpqlAndnativesql.service.ContentMappingService;
import com.jpqlAndnativesql.jpqlAndnativesql.service.EmployeeService;
import com.jpqlAndnativesql.jpqlAndnativesql.service.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpqlAndnativesqlApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(JpqlAndnativesqlApplication.class, args);
		EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
		//jpql and native sql
		//employeeService.findAllAboveAvg();
		//employeeService.updateBelowAvgEmpSalary(15000);
		//employeeService.deleteEmployeeMinSalary();
		//employeeService.getAllEmpNameEndsWith();
		//employeeService.deleteEmployeeAgeGreaterThan(45);

		//inheritance mapping
		PaymentService paymentService=applicationContext.getBean(PaymentService.class);

		//paymentService.paymentSingle();
		//paymentService.paymentJoined();
		//paymentService.paymentPerClass();

		ContentMappingService contentMappingService=applicationContext.getBean(ContentMappingService.class);
		contentMappingService.createComponentMappedEmployee();

	}

}
