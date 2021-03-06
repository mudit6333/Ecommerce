package com.SpringBoot.SpringRestfulWeb.Ques2to9;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService employeeDaoService;

    // Q.3 Implement GET http request for Employee to get list of employees.
    @GetMapping("/employee")
    public List<Employee> retrieveAllEmployees() {
        return employeeDaoService.findAll();
    }

    // Q.4 Implement GET http request using path variable top get one employee
    @GetMapping("/employee/{id}")
    public Employee retrieveOneUser(@PathVariable int id) {
        Employee employee = employeeDaoService.findOne(id);

        //Q.6 Implement Exception Handling for resource not found
       if (employee == null)
           throw new EmployeeNotFoundException("id - " + id);
        return employee;
    }

    // Q.5 Implement POST http request for Employee to create a new employee.
    @PostMapping("/employee")
    // Q.9 Apply validation while create a new employee using POST http Request.
    // ->  Employee.java
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeDaoService.save(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    // Q.7 Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/employee/{id}")
    public void deleteById(@PathVariable int id) {
        Employee employee = employeeDaoService.deleteById(id);

       if (employee == null)
          throw new EmployeeNotFoundException("id - " + id);

    }

    // Q.8 Implement PUT http request for Employee to update employee
    @PutMapping("/employee/{id}")
    public Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable int id) {

        Employee employee = employeeDaoService.findOne(id);
        if (employee != null) {
            employee.setName(newEmployee.getName());
            employee.setAge(newEmployee.getAge());
            return employee;
        } else {
            newEmployee.setId(id);
            return employeeDaoService.save(newEmployee);
        }
    }
}
