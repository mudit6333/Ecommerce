package com.SpringBoot.SpringRestfulWeb.Ques2to9;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {
    private static List<Employee> employee = new ArrayList<>();

    private static int usersCount = 3;

    static {
        employee.add(new Employee(101, "Vinay", 24));
        employee.add(new Employee(201, "Ashu", 29));
        employee.add(new Employee(301, "Deepak", 38));
    }

    public List<Employee> findAll() {
        return employee;
    }

    public Employee save(Employee employee) {
        if (employee.getId() == 0) {
            employee.setId(++usersCount * 100 + 1);
        }
        EmployeeDaoService.employee.add(employee);
        return employee;
    }

    public Employee findOne(int id) {
        for (Employee employee : employee) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee deleteById(int id) {
        Iterator<Employee> iterator = employee.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }


}
