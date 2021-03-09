package com.SpringBoot.SpringRestfulWeb.Employee;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@ApiModel(value = "Employee",description="Employee class with employee parameters")
public class Employee {
    private int id;
    @Size(min = 2, message = "minimum length required is 2")
    @ApiModelProperty(notes="Minimum length required is 2")
    private String name;

    @Min(value = 18, message = "Employee must be an adult")
    @ApiModelProperty(notes="Should be greater than or equal to 18")
    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
