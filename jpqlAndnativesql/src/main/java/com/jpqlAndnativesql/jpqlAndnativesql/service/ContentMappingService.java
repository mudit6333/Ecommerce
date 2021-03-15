package com.jpqlAndnativesql.jpqlAndnativesql.service;
import com.jpqlAndnativesql.jpqlAndnativesql.entity.EmployeeContentMapping;
import com.jpqlAndnativesql.jpqlAndnativesql.entity.Salary;
import com.jpqlAndnativesql.jpqlAndnativesql.repos.ContentMappingEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentMappingService {

    @Autowired
    ContentMappingEmployeeRepository componentMappingEmployeeRepository;

    public void createComponentMappedEmployee(){
        EmployeeContentMapping employeeNew = new EmployeeContentMapping();
        employeeNew.setId(201);
        employeeNew.setFirstName("Vinay");
        employeeNew.setLastName("Pratap");
        employeeNew.setAge(23);

        Salary salary = new Salary();
        salary.setBasicSalary(29000.0);
        salary.setBonusSalary(12000.0);
        salary.setTaxAmount(1800.0);
        salary.setSpecialAllowanceSalary(4500.0);

        employeeNew.setSalary(salary);

        componentMappingEmployeeRepository.save(employeeNew);

    }
}
