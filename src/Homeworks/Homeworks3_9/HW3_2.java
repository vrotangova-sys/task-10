package Homeworks.Homeworks3_9;

public class HW3_2 {
    public static void main(String[] args) {

        // public class PowerLoop {
        //    public static void main(String[] args) {
        //        int base = 5;           // Число, которое будем возводить в степень
        //        int power = 1;          // Начальный показатель степени
        //
        //        // Цикл продолжается, пока результат меньше 10000
        //        while (Math.pow(base, power) < 10000) {
        //            double result = Math.pow(base, power);  // Возводим в степень
        //            System.out.println("5^" + power + " = " + result);  // Выводим результат
        //            power++;  // Увеличиваем показатель степени


        int base = 5;
        int power = 1;
        while (Math.pow(base, power) < 10000) {
            double result = Math.pow(base, power);
            System.out.println("5^" + power + " = " + result);
            power++;
        }

        System.out.println();

        int base1 = 3;
        int power1 = 2;
        while (Math.pow(base1, power1) < 150000) {
            double result = Math.pow(base1, power1);
            System.out.println("3^" + power1 + "=" + result);
            power1++;
        }

        //Возводи число 2 в степень, начиная с 1, пока результат меньше 1000. Выводи каждую степень и результат.
        //
        //Пример вывода: 2^1 = 2.0 2^2 = 4.0

        System.out.println(" Степени двойки");

        int base2 = 2;
        int power2 = 1;
        while (Math.pow(base2, power2) < 1000) {
            double result = Math.pow(base2, power2);
            System.out.println("2^" + power2 + "=" + result);
            power2++;
        }
        System.out.println("Степени семерки");
        // Возводи число 7 в степень, начиная с 1, пока результат меньше 50000. Выводи результат на каждой итерации

        int base3 = 7;
        int power3 = 1;
        while (Math.pow(base3, power3) < 5000) {
            double result = Math.pow(base3, power3);
            System.out.println("7^" + power3 + "=" + result);
            power3++;
        }

        System.out.println("Задача 3");

        //Возводи число 10 в степень, начиная с 6 и уменьшая показатель,
        // пока результат больше 1. Выводи результат на каждой итерации.

        int base4 = 10;
        int power4 = 6;
        while (Math.pow (base4,power4) > 1) {
            double result = Math.pow(base4, power4);
            System.out.println("10^" + power4 + "=" + result);
            power4 --;
        }
        System.out.println("Задача 4: Степени с шагом через 2");
        // Возводи число 3 в степень, начиная с 1, увеличивая показатель на 2 (т.е. 1, 3, 5...),
        // пока результат меньше 10000. Выводи результат.
        int base5 = 3;
        int power5 = 1;
        while (Math.pow(base5, power5) < 10000) {
            // Проверяем: степень нечётная
            if (power5 % 2 != 0) {
                double result = Math.pow(base5, power5);
                System.out.println(base + "^" + power5 + " = " + result);
            }

            power5++; // увеличиваем степень на каждом шаге


            System.out.println();

            //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
            //Реализовать 2 варианта:
            //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
            //без использования конструкции if (шаг цикла на ваше усмотрение).
            System.out.println("Задача 3 c конструкцией if");

            for (int i = 40; i < 60; i++ ) {
                if (i % 4 == 0) {
                    System.out.println(i);
                }

            }
        }
        System.out.println(" Задача 3 без конструкции if");
        //
        for (int k = 40; k < 60; k += 4) {
            System.out.println(k);
        }
        System.out.println("Задача 1");

        //  Необходимо вывести числа от 0 до 15.

        for ( int i = 0; i < 15; i ++) {
            System.out.println(i);
        }
        }


        }

























