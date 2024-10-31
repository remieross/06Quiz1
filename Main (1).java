public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        employee.salary = 50000;
        director.salary = 80000;
        manager.budget = 100000;
        director.stockOptions = 1000;
    }
}

class Employee {
    public int salary;
}

class Manager extends Employee {
    public int budget;
}

class Director extends Manager {
    public int stockOptions;
}
