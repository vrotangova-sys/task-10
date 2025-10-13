package Homeworks.Homeworks10;

public class Employee {

   // Необходимо создать класс Employee со следующими методами:
    //getBaseSalary - получить базовую ставку
   // setBaseSalary
   // getName - получить имя
   // setName
   // getSalary - получить зарплату

    String name;
    Double salary;
    Double baseSalary;
    String position;

    public Employee (String name,Double salary,Double baseSalary,String position) {
    this.name = name;
    this.salary = salary;
    this.baseSalary = baseSalary;
    this.position = position;
    }
    public void setName (String newName) {
        name = newName;
    }
    public String getName () {
        return name;
    }
    public void setBaseSalary (Double newBaseSalary) {
        baseSalary = newBaseSalary;
    }
    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setSalary (Double newSalary) {
        salary = newSalary;
    }
    public  Double getSalary () {
        return salary;
    }
    public void setPosition (String newPosition) {
        position = newPosition;
    }
    public String getPosition() {
        return position;
    }
}
