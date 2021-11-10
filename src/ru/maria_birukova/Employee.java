package ru.maria_birukova;

public class Employee {

    private static int id = 0;
    private int employeeId;
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
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

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId + " ФИО: " + name + " Отдел: " + department + " Зарплата: " + salary;
    }

}
