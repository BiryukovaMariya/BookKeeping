package ru.maria_birukova;

public class EmployeeBook {

    // Все персонажи и события вымышлены, любые совпадения случайны
    private Employee[] unit = new Employee[10];

    public EmployeeBook() {
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
    }

    public void getListOfEmployees() {
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i]);
        }
    }

    public int calculateAmountOfCosts() {
        int costs = 0;
        for (int i = 0; i < unit.length; i++) {
            costs += unit[i].getSalary();
        }
        return costs;
    }

    public void findMinimumSalary() {

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

    public void findMaximumSalary() {

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

    public int averageSalary() {
        return calculateAmountOfCosts() / unit.length;
    }

    public void getEmployeesNames() {
        for (int i = 0; i < unit.length; i++) {
            System.out.println(unit[i].getName());
        }
    }

    public void increaseSalary(int percentageIncrease) {
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

    public void minimumByDepartment(int department) {

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

    public void maximumByDepartment(int department) {

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

    public void calculateCostsByDepartment(int department) {
        int costs = 0;
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                costs += unit[i].getSalary();
            }
        }
        System.out.println("Затраты на зарплаты в месяц по отделу " + department + ": " + costs);
    }

    public void averageSalaryByDepartment(int department) {
        int salarySum = 0;
        int employees = 0;
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                salarySum += unit[i].getSalary();
                employees++;
            }
        }
        System.out.println("Среднее значение зарплаты по отделу " + department + " составляет: " + salarySum / employees);
    }

    public void increaseSalaryByDepartment(int percentageIncrease, int department) {
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

    public void printEmployeeByDepartment(int department) {
        for (int i = 0; i < unit.length; i++) {
            if (unit[i].getDepartment() == department) {
                System.out.println("ID: " + unit[i].getId() + " ФИО: " + unit[i].getName() + " Зарплата: " + unit[i].getSalary());
            }
        }
    }

    public void printEmployeeLessAmount(int amount) {
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

    public void printEmployeeMoreAmount(int amount) {
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

}
