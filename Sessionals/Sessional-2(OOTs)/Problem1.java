import java.util.*;

class Employee {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

public class Problem1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Random1", 30, 15000));
        employees.add(new Employee("Random2", 25, 20000));
        employees.add(new Employee("Random3", 40, 8000));
        employees.add(new Employee("Random4", 21, 45600));

        System.out.println("Before sorting:");
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }

        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

        System.out.println("\nAfter sorting:");
        for (Employee employee : employees) {
            System.out.println(employee.getSalary());
        }
    }
}