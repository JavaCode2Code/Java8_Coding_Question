package com.scjp.java.code.employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
  static List<Employee> employees =
            List.of(
            new Employee(1, "Alice", "IT", 75000, List.of("Cloud", "Security")),
            new Employee(2, "Bob", "IT", 45000, List.of("Legacy System")),
            new Employee(3, "Charlie", "IT", 90000, List.of("Cloud", "AI")),
            new Employee(4, "Diana", "HR", 60000, List.of("Recruiting")),
            new Employee(5, "Evan", "HR", 65000, List.of("Recruiting", "Onboarding")),
            new Employee(6, "Fiona", "Finance", 85000, List.of("Audit")),
            new Employee(7, "George", "Finance", 40000, List.of("Tax"))
    );
    public static void main(String[] args) {
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .forEach((department, employee) -> {
                    System.out.println("Highest salary in " + department + ": " + employee.get().getName() + " with salary " + employee.get().getSalary());
                });
    }
}
