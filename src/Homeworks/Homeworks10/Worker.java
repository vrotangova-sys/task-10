package Homeworks.Homeworks10;
// Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.

public class Worker extends Employee {

    public Worker(String name, Double salary, Double baseSalary, String position) {
        super(name, salary, baseSalary, position);
    }
    public Double getSalaryWorker() {
        return baseSalary;
    }
}