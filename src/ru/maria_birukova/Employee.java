package ru.maria_birukova;

public class Employee {

    private static int id = 0;
    private int employeeId;
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        id++;
        this.employeeId = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new RuntimeException("Нельзя работать бесплатно!");
        }
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId + " ФИО: " + name + " Отдел: " + department + " Зарплата: " + salary;
    }

}
