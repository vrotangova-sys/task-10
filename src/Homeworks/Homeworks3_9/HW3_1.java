package Homeworks.Homeworks3_9;

public class HW3_1 {
    public static void main(String[] args) {
        // Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        //a == b - если переменные равны
        //a < b - если переменная a меньше b
        //a > b - если переменная b меньше a

        int a = 5;
        int b = 18;

        if (a == b) {
            System.out.println("a == b");}

        else if (a < b) {
            System.out.println("a < b");}
        else if (a > b) {
            System.out.println("a > b");}

        System.out.println();

        //Необходимо создать две целочисленные переменные (a, b),
        // присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        //maybe a and b are even - если сумма переменных четная
        //some variable is odd - если сумма переменных нечетная

        if ((a + b) % 2 ==0) {
            System.out.println("Maybe a and b are even");}
        else {
            System.out.println("Some variable is odd");}

        System.out.println();
         // Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор
        // и вывести следующие строки:
        //больше 10 - если переменная больше 10
        //меньше 100 - если переменная меньше 100
        //результат деления на 2 больше 20 - если это соответствует истине
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        int c = 19;
        if (c > 10) {
            System.out.println("c > 10");
        }
         if (c < 100) {
             System.out.println(" c < 100");
         }
         if ( ((c / 2) > 20) && (c <= 40)){
            System.out.println(" true ");
        } else{
            System.out.println(" false ");
        }

        }

        }


