package session_19.challenge.exercise_12;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
    /* Given a list of employee objects with attributes: name, department, and salary; find the department with
    the highest total salary. */

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Travolta", Department.FINANCE, 1250),
                new Employee("Bob", "Beckham", Department.HR, 2000),
                new Employee("Tom", "Felon", Department.DEVELOPMENT, 1850),
                new Employee("Sara", "Paxton", Department.IT, 3000),
                new Employee("Ellen", "Ewing", Department.HR, 1950),
                new Employee("Sue", "Aiken", Department.DEVELOPMENT, 2200),
                new Employee("Sarah", "Polley", Department.FINANCE, 1200),
                new Employee("Ella", "Bleu", Department.FINANCE, 1440)
        );

        Map<Department, Integer> departmentSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));

        Optional<Map.Entry<Department, Integer>> maxSalaryDepartment = departmentSalaries.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue));

        maxSalaryDepartment.ifPresent(entry -> {
            System.out.println("Department with highest salary: " + entry.getKey());
            System.out.println("Total salary: " + entry.getValue());
        });
    }
}
