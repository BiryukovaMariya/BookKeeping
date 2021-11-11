package ru.maria_birukova;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employees = new EmployeeBook();

        printDivider();

        employees.getListOfEmployees();

        printDivider();

        System.out.println("Затраты на зарплаты в месяц: " + employees.calculateAmountOfCosts());

        printDivider();

        employees.findMinimumSalary();

        printDivider();

        employees.findMaximumSalary();

        printDivider();

        System.out.println("Среднее значение зарплат: " + employees.averageSalary());

        printDivider();

        employees.getEmployeesNames();

        printDivider();

        employees.increaseSalary(10);

        printDivider();

        employees.minimumByDepartment(1);
        employees.minimumByDepartment(2);
        employees.minimumByDepartment(3);
        employees.minimumByDepartment(4);
        employees.minimumByDepartment(5);

        printDivider();

        employees.maximumByDepartment(1);
        employees.maximumByDepartment(2);
        employees.maximumByDepartment(3);
        employees.maximumByDepartment(4);
        employees.maximumByDepartment(5);

        printDivider();

        employees.calculateCostsByDepartment(1);
        employees.calculateCostsByDepartment(2);
        employees.calculateCostsByDepartment(3);
        employees.calculateCostsByDepartment(4);
        employees.calculateCostsByDepartment(5);

        printDivider();

        employees.averageSalaryByDepartment(1);
        employees.averageSalaryByDepartment(2);
        employees.averageSalaryByDepartment(3);
        employees.averageSalaryByDepartment(4);
        employees.averageSalaryByDepartment(5);

        printDivider();

        employees.increaseSalaryByDepartment(7, 1);

        printDivider();

        employees.increaseSalaryByDepartment(20, 2);
        printDivider();
        employees.increaseSalaryByDepartment(5, 3);
        printDivider();
        employees.increaseSalaryByDepartment(8, 4);
        printDivider();
        employees.increaseSalaryByDepartment(3, 5);

        printDivider();

        employees.printEmployeeByDepartment(1);
        printDivider();
        employees.printEmployeeByDepartment(2);
        printDivider();
        employees.printEmployeeByDepartment(3);
        printDivider();
        employees.printEmployeeByDepartment(4);
        printDivider();
        employees.printEmployeeByDepartment(5);

        printDivider();

        employees.printEmployeeLessAmount(5_000);
        printDivider();
        employees.printEmployeeLessAmount(50_000);

        printDivider();

        employees.printEmployeeMoreAmount(50_000);
        printDivider();
        employees.printEmployeeMoreAmount(500_000);

        printDivider();

    }

    public static void printDivider() {
        System.out.println("================================================================================================");
    }

}
