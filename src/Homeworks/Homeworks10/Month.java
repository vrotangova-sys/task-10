package Homeworks.Homeworks10;


//Создать неизменяемый (immutable) класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Поля должны быть спрятаны, для каждого поля создать getter.
//Создать класс MonthUtils который бы хранил подготовленные месяцы или их
// массивы для использования (объекты класса Month).


public final class Month {

    private final String nameOfMonth;
    private final int numberOfDays;
    private final int numberOfWorkingDays;

    public Month (String nameOfMonth,int numberOfDays, int numberOfWorkingDays) {
        this.nameOfMonth = nameOfMonth;
        this.numberOfDays = numberOfDays;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }


}
