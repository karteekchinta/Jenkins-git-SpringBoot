package com.employeeDataexample.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCommandLinerunner implements CommandLineRunner {
    @Autowired
    private EmployeeJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Employee("kartheek", "chinta", "xyz@gmail.com", "vishakapatnam"));
        repository.insert(new Employee("Hemanth", "kota", "abc@yahoo.com","Banglore"));

    }
}
