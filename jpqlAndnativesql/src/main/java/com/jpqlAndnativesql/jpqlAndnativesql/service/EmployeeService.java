package com.jpqlAndnativesql.jpqlAndnativesql.service;

import com.jpqlAndnativesql.jpqlAndnativesql.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public void findAllAboveAvg() {
        List<Object[]> list = employeeRepository.findAllEmployee(Sort.by
                (new Sort.Order(Sort.Direction.ASC, "age"),
                        new Sort.Order(Sort.Direction.DESC, "salary")));
        list.forEach(emp -> System.out.println(emp[0] + " " + emp[1]));
    }

    @Transactional
    public void updateBelowAvgEmpSalary(double salary) {
        double avgSalary = employeeRepository.findAverageSalary();
        employeeRepository.updateBelowAvgEmpSalary(salary, avgSalary);
    }

    @Transactional
    public void deleteEmployeeMinSalary() {
        double minSalary = employeeRepository.findMinSalary();
        employeeRepository.deleteEmpMinSalary(minSalary);
    }

    //  Q.4 Display the id, first name, age of all employees where last name ends with "singh"
    public void getAllEmpNameEndsWith() {
        List<Object[]> singhNames = employeeRepository.getAllEmpNameEndsWith();
        singhNames.forEach(emp -> System.out.println(emp[0] + " " + emp[1] + " " + emp[2]));

    }

    // Q.5 Delete all employees with age greater than 45(Should be passed as a parameter)
    @Transactional
    public void deleteEmployeeAgeGreaterThan(int age) {
        employeeRepository.deleteEmpAgeGreaterThan(age);
    }
}
