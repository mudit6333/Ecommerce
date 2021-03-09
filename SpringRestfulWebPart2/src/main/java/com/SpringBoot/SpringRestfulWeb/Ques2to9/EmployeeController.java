package com.SpringBoot.SpringRestfulWeb.Ques2to9;


import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDaoService employeeDaoService;

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/welcome")
    @ApiOperation(value = "welcome", notes ="welcome message")
    public String helloWorldInternationalized() {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale());
    }

    @GetMapping(path = "/welcome", params = "username")
    @ApiOperation(value = "welcome user", notes ="welcome message with username")
    public String helloWorldInternationalizedWithParam(@RequestParam String username) {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale()) + " " + username;
    }

    @GetMapping("/employee")
    @ApiOperation(value = "GET all employees", notes = "Get employees details")
    @ApiModelProperty(notes = "Get all employee details")
    public List<Employee> retrieveAllEmployees() {
        return employeeDaoService.findAll();
    }


    @GetMapping("/employee/{id}")
    @ApiOperation(value = "GET employee", notes = "Get specific employee details")
    public EntityModel<Employee> retrieveOneUser(@PathVariable int id) {
        Employee employee = employeeDaoService.findOne(id);

        if (employee == null)
            throw new EmployeeNotFoundException("id - " + id);

        EntityModel<Employee> resource = EntityModel.of(employee);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllEmployees());
        resource.add(linkTo.withRel("all-employees"));
        return resource;
    }


    @PostMapping("/employee")
    @ApiOperation(value = "ADD", notes = "Add new employee")
    public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeDaoService.save(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employee/{id}")
    @ApiOperation(value = "Delete employee", notes = "Delete specific employee")
    public void deleteById(@PathVariable int id) {
        Employee employee = employeeDaoService.deleteById(id);

        if (employee == null)
            throw new EmployeeNotFoundException("id - " + id);

    }


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
