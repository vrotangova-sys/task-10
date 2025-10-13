package Homeworks.Homeworks3_9;

public class Lessons {
    public static void main(String[] args) {

        /* Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:

a == b - если переменные равны
a < b - если переменная a меньше b
a > b - если переменная b меньше a

         */
        int a = 18;
        int b = 81;
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        if (a == b) {
            System.out.println(" a == b ");
        } else  if (a < b){
            System.out.println(" a < b ");
        } else if (a > b) {
            System.out.println(" a > b ");}


      // maybe a and b are even - если сумма переменных четная
        //some variable is odd - если сумма переменных нечетная

        if(b % 2 == 0) {
            System.out.println(" b четное ");
        } else {
            System.out.println(" b нечетное");}
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");}
        //Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        //больше 10 - если переменная больше 10
        //меньше 100 - если переменная меньше 100
        //результат деления на 2 больше 20 - если это соответствует истине
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        if (a > 10) {
            System.out.println("больше 10");}
        if (a <= 100) {
            System.out.println("меньше 100");}
        else {
            System.out.println("больше 100");}
        if ((a / 2) < 20) {
            System.out.println("true");}
        else {
            System.out.println("false");}
        if (a >= 5 && a <= 40) {
            System.out.println("true");}
        else {
            System.out.println("не в диапазоне");}

        boolean inRange = a >= 18 && a <= 80;
        if (inRange) {
            System.out.println("Добро Пожаловать!");
        } else {
            System.out.println("Пшел вон, щенок!");
        }


        boolean isEven = a % 2 == 0;
                if (isEven) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
        boolean isInRange =  b > 80 && b < 100;
                if (isInRange) {
                    System.out.println("извините, но вы слишком старый! До свидания!");
                }

    }


}


