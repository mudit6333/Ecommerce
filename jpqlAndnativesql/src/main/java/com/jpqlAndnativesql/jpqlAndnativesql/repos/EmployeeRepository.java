package com.jpqlAndnativesql.jpqlAndnativesql.repos;

import com.jpqlAndnativesql.jpqlAndnativesql.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    /* Q.1 Display the first name, last name of all employees having salary greater than average salary ordered
      in ascending by their age and in descending by their salary.*/
    @Query("SELECT firstName, lastName from Employee where salary<(select avg(salary) from Employee)")
    List<Object[]> findAllEmployee(Sort sort);

    @Query("Select AVG(salary) from Employee")
    int findAverageSalary();

    @Modifying
    @Query("update Employee e set e.salary=:salary where e.salary <:avgSalary")
    void updateBelowAvgEmpSalary(@Param("salary") double salary, @Param("avgSalary") double avgSalary);

    @Query("Select MIN(salary) from Employee")
    double findMinSalary();

    @Modifying
    @Query("DELETE FROM Employee WHERE salary =:minSalary")
    void deleteEmpMinSalary(@Param("minSalary") double minSalary);

    @Query(value = "SELECT empId, empFirstName, empAge from employeeTable where empLastName like '%singh'", nativeQuery = true)
    List<Object[]> getAllEmpNameEndsWith();

    @Modifying
    @Query(value = "DELETE from employeeTable where empAge>:age", nativeQuery = true)
    void deleteEmpAgeGreaterThan(@Param("age") int age);


}
