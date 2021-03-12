package com.JPAwithHibernate.Employee.repos;

import com.JPAwithHibernate.Employee.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByName(String name);
    List<Employee> findByNameStartsWith(Character c);
    List<Employee> findByAgeBetween(Integer i1 , Integer i2);
    List<Employee> findByAgeGreaterThan(Integer i1 , Pageable pageable);
    List<Employee> findByAgeGreaterThan(Integer i1 );

}
