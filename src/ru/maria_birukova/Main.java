package ru.maria_birukova;

public class Main {

    public static void main(String[] args) {

        // Все персонажи и события вымышлены, любые совпадения случайны
        Employee[] unit = new Employee[10];
        unit[0] = new Employee("Иван Петров", 1, 54_674);
        unit[1] = new Employee("Василий Пупкин", 2, 125_439);
        unit[2] = new Employee("Николай Сидоров", 3, 15_800);
        unit[3] = new Employee("John Doe", 4, 68_798);
        unit[4] = new Employee("Марина Николаевна", 5, 33_453);
        unit[5] = new Employee("Антонина Петровна", 1, 23_456);
        unit[6] = new Employee("Тарас Сергеевич", 2, 53_323);
        unit[7] = new Employee("София Васильевна", 3, 234_145);
        unit[8] = new Employee("Маргарита Ивановна", 4, 10_346);
        unit[9] = new Employee("Антон Егорович", 5, 99_999);

        printDivider();
        getListOfEmployees(unit);
        printDivider();
        System.out.println("Затраты на зарплаты в месяц: " + calculateAmountOfCosts(unit));
        printDivider();
        findMinimumSalary(unit);
        printDivider();
        findMaximumSalary(unit);
        printDivider();
        System.out.println("Среднее значение зарплат: " + averageSalary(unit));
        printDivider();
        getEmployeesNames(unit);
        printDivider();
        increaseSalary(unit, 10);
        printDivider();
        minimumByDepartment(unit, 1);
        minimumByDepartment(unit, 2);
        minimumByDepartment(unit, 3);
        minimumByDepartment(unit, 4);
        minimumByDepartment(unit, 5);
        printDivider();
        maximumByDepartment(unit, 1);
        maximumByDepartment(unit, 2);
        maximumByDepartment(unit, 3);
        maximumByDepartment(unit, 4);
        maximumByDepartment(unit, 5);
        printDivider();
        calculateCostsByDepartment(unit, 1);
        calculateCostsByDepartment(unit, 2);
        calculateCostsByDepartment(unit, 3);
        calculateCostsByDepartment(unit, 4);
        calculateCostsByDepartment(unit, 5);
        printDivider();
        averageSalaryByDepartment(unit, 1);
        averageSalaryByDepartment(unit, 2);
        averageSalaryByDepartment(unit, 3);
        averageSalaryByDepartment(unit, 4);
        averageSalaryByDepartment(unit, 5);
        printDivider();
        increaseSalaryByDepartment(unit, 7, 1);
        printDivider();
        increaseSalaryByDepartment(unit, 20, 2);
        printDivider();
        increaseSalaryByDepartment(unit, 5, 3);
        printDivider();
        increaseSalaryByDepartment(unit, 8, 4);
        printDivider();
        increaseSalaryByDepartment(unit, 3, 5);
        printDivider();
        printEmployeeByDepartment(unit, 1);
        printDivider();
        printEmployeeByDepartment(unit, 2);
        printDivider();
        printEmployeeByDepartment(unit, 3);
        printDivider();
        printEmployeeByDepartment(unit, 4);
        printDivider();
        printEmployeeByDepartment(unit, 5);
        printDivider();
        printEmployeeLessAmount(unit, 5_000);
        printDivider();
        printEmployeeLessAmount(unit, 50_000);
        printDivider();
        printEmployeeMoreAmount(unit, 50_000);
        printDivider();
        printEmployeeMoreAmount(unit, 500_000);
        printDivider();

    }

    public static void getListOfEmployees(Employee[] unit) {
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i]);
        }
    }

    public static int calculateAmountOfCosts(Employee[] unit) {
        int costs = 0;
        for (int i = 0; i < unit.length; i++) {
            costs += unit[i].getSalary();
        }
        return costs;
    }

    public static void findMinimumSalary(Employee[] unit) {

        int[] min = {unit[0].getSalary(), unit[0].getId()};

        for (int i = 0; i < unit.length; i++) {
            if (min[0] > unit[i].getSalary()) {
                min[0] = unit[i].getSalary();
                min[1] = unit[i].getId();
            }
        }

        for (int i = 0; i < unit.length; i++) {
            if (min[1] == unit[i].getId()) {
                System.out.println("Минимальная зарплата: " + unit[i].getSalary() + " у сотрудника " + unit[i].getId() + " по имени " + unit[i].getName() + " из отдела: " + unit[i].getDepartment());
            }
        }

    }

    public static void findMaximumSalary(Employee[] unit) {

        int[] max = {unit[0].getSalary(), unit[0].getId()};

        for (int i = 0; i < unit.length; i++) {
            if (max[0] < unit[i].getSalary()) {
                max[0] = unit[i].getSalary();
                max[1] = unit[i].getId();
            }
        }

        for (int i = 0; i < unit.length; i++) {
            if (max[1] == unit[i].getId()) {
                System.out.println("Максимальная зарплата: " + unit[i].getSalary() + " у сотрудника " + unit[i].getId() + " по имени " + unit[i].getName() + " из отдела: " + unit[i].getDepartment());
            }
        }

    }

    public static int averageSalary(Employee[] unit) {
        return calculateAmountOfCosts(unit) / unit.length;
    }

    public static void getEmployeesNames(Employee[] unit) {
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i].getName());
        }
    }

    public static void increaseSalary(Employee[] unit, int percentageIncrease) {
        if (percentageIncrease <= 0) {
            throw new RuntimeException("Нельзя повышать зарплату на такой процент!");
        }
        int currentSalary = 0;
        int increment = 0;
        System.out.println("Повышение зарплат всех сотрудников на " + percentageIncrease + "%:");
        for (int i = 0; i < unit.length; i++) {
            currentSalary = unit[i].getSalary();
            increment = percentageIncrease * currentSalary / 100;
            unit[i].setSalary(currentSalary + increment);
            System.out.println("Проиндексированная зарплата у " + unit[i].getName() + " составляет: " + unit[i].getSalary());
        }
    }

    public static void minimumByDepartment(Employee[] unit, int department) {

        int[] min = {unit[0].getSalary(), unit[0].getId()};

        for (int i = 0; i < unit.length; i++) {
            if (min[0] > unit[i].getSalary() && unit[i].getDepartment() == department) {
                min[0] = unit[i].getSalary();
                min[1] = unit[i].getId();
            }
        }

        for (int i = 0; i < unit.length; i++) {
            if (min[1] == unit[i].getId()) {
                System.out.println("Минимальная зарплата по отделу " + department + ": " + unit[i].getSalary() + " у сотрудника " + unit[i].getId() + " по имени " + unit[i].getName());
            }
        }
    }

    public static void maximumByDepartment(Employee[] unit, int department) {

        int[] max = {unit[0].getSalary(), unit[0].getId()};

        for (int i = 0; i < unit.length; i++) {
            if (max[0] < unit[i].getSalary() && unit[i].getDepartment() == department) {
                max[0] = unit[i].getSalary();
                max[1] = unit[i].getId();
            }
        }

        for (int i = 0; i < unit.length; i++) {
            if (max[1] == unit[i].getId()) {
                System.out.println("Максимальная зарплата по отделу " + department + ": " + unit[i].getSalary() + " у сотрудника " + unit[i].getId() + " по имени " + unit[i].getName());
            }
        }

    }

    public static void calculateCostsByDepartment(Employee[] unit, int department) {
        int costs = 0;
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                costs += unit[i].getSalary();
            }
        }
        System.out.println("Затраты на зарплаты в месяц по отделу " + department + ": " + costs);
    }

    public static void averageSalaryByDepartment(Employee[] unit, int department) {
        int salarySum = 0;
        int emploees = 0;
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                salarySum += unit[i].getSalary();
                emploees++;
            }
        }
        System.out.println("Среднее значение зарплаты по отделу " + department + " составляет: " + salarySum / emploees);
    }

    public static void increaseSalaryByDepartment(Employee[] unit, int percentageIncrease, int department) {
        if (percentageIncrease <= 0) {
            throw new RuntimeException("Нельзя повышать зарплату на такой процент!");
        }
        int currentSalary = 0;
        int increment = 0;
        System.out.println("Повышение зарплат всех сотрудников отдела " + department + " на " + percentageIncrease + "%:");
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                currentSalary = unit[i].getSalary();
                increment = percentageIncrease * currentSalary / 100;
                unit[i].setSalary(currentSalary + increment);
                System.out.println("Проиндексированная зарплата у " + unit[i].getName() + " составляет: " + unit[i].getSalary());
            }
        }
    }

    public static void printEmployeeByDepartment(Employee[] unit, int department) {
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                System.out.println("ID: " + unit[i].getId() + " ФИО: " + unit[i].getName() + " Зарплата: " + unit[i].getSalary());
            }
        }
    }

    public static void printEmployeeLessAmount(Employee[] unit, int amount) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой менее " + amount + ":");
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getSalary() < amount) {
                System.out.println("ID: " + unit[i].getId() + " ФИО: " + unit[i].getName() + " Зарплата: " + unit[i].getSalary());
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("Таких сотрудников нет!");
        }
    }

    public static void printEmployeeMoreAmount(Employee[] unit, int amount) {
        int count = 0;
        System.out.println("Сотрудники с зарплатой более или равной " + amount + ":");
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getSalary() >= amount) {
                System.out.println("ID: " + unit[i].getId() + " ФИО: " + unit[i].getName() + " Зарплата: " + unit[i].getSalary());
                count++;
            }
        }
        if (count <= 0) {
            System.out.println("Таких сотрудников нет!");
        }
    }

    public static void printDivider() {
        System.out.println("================================================================================================");
    }

}
