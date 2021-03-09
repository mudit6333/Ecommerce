package com.SpringBoot.SpringRestfulWeb.Ques2to9;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
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


    @GetMapping("/employee")
    @ApiModelProperty(notes = "Get all employee details")
    public List<Employee> retrieveAllEmployees() {
        return employeeDaoService.findAll();
    }


    @GetMapping("/employee/{id}")
    @ApiModelProperty(notes = "Get specific employee details")
    public Employee retrieveOneUser(@PathVariable int id) {
        Employee employee = employeeDaoService.findOne(id);
        
       if (employee == null)
           throw new EmployeeNotFoundException("id - " + id);
        return employee;
    }


    @PostMapping("/employee")
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
