package ru.maria_birukova;

public class Main {

    public static void main(String[] args) {

        // Все персонажи и события вымышлены, любые совпадения случайны
        Employee[] unit = new Employee[10];
        unit[0] = new Employee("Иван Петров", "One", 54_674);
        unit[1] = new Employee("Василий Пупкин", "Two", 125_439);
        unit[2] = new Employee("Николай Сидоров", "Three", 15_800);
        unit[3] = new Employee("John Doe", "Four", 68_798);
        unit[4] = new Employee("Марина Николаевна", "Five", 33_453);
        unit[5] = new Employee("Антонина Петровна", "Six", 23_456);
        unit[6] = new Employee("Тарас Сергеевич", "Seven", 53_323);
        unit[7] = new Employee("София Васильевна", "Eight", 234_145);
        unit[8] = new Employee("Маргарита Ивановна", "Отдел клининга", 10_346);
        unit[9] = new Employee("Антон Егорович", "Ten", 99_999);

        printDivider();
        getListOfEmployees(unit);
        printDivider();
        System.out.println("Затраты на зарплаты в месяц: " + calculateAmountOfCosts(unit));
        printDivider();
        findMinimumWage(unit);
        printDivider();
        findMaximumWage(unit);
        printDivider();
        System.out.println("Среднее значение зарплат: " + averageSalary(unit));
        printDivider();
        getEmployeesNames(unit);
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

    public static void findMinimumWage(Employee[] unit) {

        int[] min = {unit[0].getSalary(), 0};

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

    public static void findMaximumWage(Employee[] unit) {

        int[] max = {unit[0].getSalary(), 0};

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

    public static void printDivider() {
        System.out.println("================================================================================================");
    }

}
