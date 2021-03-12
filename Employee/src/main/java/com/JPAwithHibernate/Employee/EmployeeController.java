package com.JPAwithHibernate.Employee;

import com.JPAwithHibernate.Employee.daoService.EmployeeDaoService;
import com.JPAwithHibernate.Employee.entity.Employee;
import com.JPAwithHibernate.Employee.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @GetMapping("/employee/{id}")
    public Employee findEmp(@PathVariable int id) {
        Employee employee = employeeDaoService.find(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id - " + id);
        return employee;
    }

    @GetMapping("/employee")
    public List<Employee> findAllEmp() {
        return employeeDaoService.findAll();
    }
    @GetMapping("/employee-count")
    public String findEmpCount() {
        return  "Total Employees present are "+employeeDaoService.empCount();
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

    @PutMapping("/employee")
    public ResponseEntity<Object> updateEmployee(@Valid @RequestBody Employee employee) {
        Employee savedEmployee = employeeDaoService.update(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employee/{id}")
    public Employee deleteEmployee(@PathVariable int id) {
        Employee employee = employeeDaoService.deleteById(id);
        if (employee == null)
            throw new EmployeeNotFoundException("id - " + id);
        return employee;
    }

    @GetMapping("/employee-page")
    public Page<Employee> paging(){
        return employeeDaoService.pagingAndSorting();
    }

    @GetMapping("employee/find/{name}")
    public List<Employee> findByName(@PathVariable String name) {
        EmployeeController employeeRepository;
        return employeeDaoService.findByEmpname(name);
    }
    @GetMapping("employee/findbyA")
    public List<Employee> findByNameLike() {
        return employeeDaoService.findByEmpNameLike('A');
    }
    @GetMapping("employee/findbyage")
    public List<Employee> findByAgeBetween() {
        return employeeDaoService.findByEmpAgeBtw(18,32);
    }

}
