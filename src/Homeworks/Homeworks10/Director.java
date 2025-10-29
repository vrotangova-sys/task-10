package Homeworks.Homeworks10;

//Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат по формуле -
// <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.

public class Director extends Employee {
    public Director(String name, Double salary, Double baseSalary, String position) {
        super(name, salary, baseSalary, position);
    }

    public void setNumberOfSupordinates(int numberOfSupordinates) {
        this.numberOfSupordinates = numberOfSupordinates;
    }

    private int getNumberOfSubordinates() {
        return numberOfSupordinates;
    }

    private int numberOfSupordinates;

    public Double getSalary() {
        if (numberOfSupordinates > 0) {
            return baseSalary * (numberOfSupordinates / 100.0 * 9);
        } else { return baseSalary;}
    }
}
