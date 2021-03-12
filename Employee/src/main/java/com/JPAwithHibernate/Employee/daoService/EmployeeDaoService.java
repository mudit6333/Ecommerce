package com.JPAwithHibernate.Employee.daoService;


import com.JPAwithHibernate.Employee.entity.Employee;
import com.JPAwithHibernate.Employee.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee find(int id) {
        return employeeRepository.findById(id).get();
    }
    public List<Employee> findAll() {

        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public Employee update(Employee employee) {
        Employee updateEmp = employeeRepository.findById(employee.getId()).get();
        if (employee.getAge() != 0)
            updateEmp.setAge(employee.getAge());
        if (employee.getName() != null)
            updateEmp.setName(employee.getName());
        if (employee.getLocation() != null)
            updateEmp.setLocation(employee.getLocation());

        employeeRepository.save(updateEmp);
        return updateEmp;
    }

    public Employee deleteById(int id){

        Employee employee=employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return employee;
    }

    public long empCount(){
        return employeeRepository.count();
    }

    public Page<Employee> pagingAndSorting(){
        Pageable pageable= PageRequest.of(0,3, Sort.Direction.DESC,"age");
        Page<Employee> result=employeeRepository.findAll(pageable);
        return  result;
    }

    public List<Employee> findByEmpname(String name){
        return employeeRepository.findByName(name);
    }
    public List<Employee> findByEmpNameLike(char c){
        return employeeRepository.findByNameStartsWith(c);
    }
    public List<Employee> findByEmpAgeBtw(int min,int max){
        return employeeRepository.findByAgeBetween(min,max);
    }
}
