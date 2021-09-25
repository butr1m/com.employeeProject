package com.employeeProject.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotBlank(message = "Name is required field")
    private String name;

    @Column(name = "surname")
    @NotBlank(message = "Surname is required field")
    private String surname;

    @Column(name = "age")
    @Min(value = 18,message = "Employee must be older than 17 years")
    @Max(value = 65,message = "Employee must be younger than 66 years")
    private int age;

    @Column(name = "email")
    @Pattern(regexp = "\\w+@\\w+\\.(com|ru)",message = "The address must end with @(mail/gmail).(ru/com))")
    private String email;

    @Column(name = "phone_number")
    @Pattern(regexp = "\\d{1}-\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern X-XXX-XXX-XX-XX")
    private String phoneNumber;

    @Column(name = "department")
    @NotBlank(message = "Department is required field")
    private String department;

    @Column(name = "salary")
    @Min(value = 100,message = "salary must be greater 100 $")
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, int age, String email, String phoneNumber, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
