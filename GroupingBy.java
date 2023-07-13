package com.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 50000),
            new Employee("Jane", 60000),
            new Employee("Bob", 45000),
            new Employee("Alice", 90000)
        );

        //Salary greater than 70000
//employees.stream().filter(e->e.getSalary()>70000).map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

        //top 3 Salaries
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)
      		  .reversed()).limit(3).forEach(e->System.out.println(e.getName()));
        
        //2nd highest salary
        System.out.println("Second Highest Salary:");
        Employee e=employees.stream().sorted(Comparator.comparing(Employee::getSalary)
        .reversed()).skip(1).limit(2).findFirst().get();
       System.out.println(e.getName());
}
}
