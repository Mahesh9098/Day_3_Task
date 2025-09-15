package Task_3_CollectionsAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", Age=" + age + ", Salary=" + salary + "]";
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jaidy", 22, 50000));
        employees.add(new Employee("Yuvi", 25, 75000));
        employees.add(new Employee("Falesh", 22, 45000));
        employees.add(new Employee("Aadi", 30, 70000));
        employees.add(new Employee("Mahesh", 35, 95000));

        System.out.println("Original List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        //Sort by Salary(desc)
        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Desc):");
        employees.forEach(System.out::println);

        //Sort by Name(asc)
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name (Asc):");
        employees.forEach(System.out::println);
    }
}
