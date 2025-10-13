package Homeworks.Homeworks10;
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
// в классе, метод getSalary будет возвращать значение по формуле -
// <базовая ставка> * (<количество подчиненных> / 100 * 3).
// Если количество подчиненных 0, то результат как у обычного рабочего.

public class Manager extends Employee {

    public Manager(String name, Double salary, Double baseSalary, String position) {
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
        return baseSalary * (numberOfSupordinates / 100.0 * 3);
    }
}

