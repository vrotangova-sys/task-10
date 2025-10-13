package Homeworks.Homeworks3_9;

public class HW_5 {
    public static void main(String[] args) {
        //Задача №1
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        //
        //Задача №2
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        //
        //Задача №3
        //
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        //
        //Задача №4
        //
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        //
        //Экстра задача №1
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.
        //
        //Экстра задача №2
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.
        //
        //Экстра задача №3
        //
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.

//        System.out.println("Задача 1");
//
        //  int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) { -  цикл к задаче 1
//        int max = array[0];
//        int min = array[0];
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] < min) {
//                min = array[i];
//            }
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array [i];
//
//        }
//        int average = sum / array.length;
//
//        System.out.println(average);


        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                sum += array[i][j];
//            }
//        }
//        System.out.println(sum);

//        int max = array [0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++)
//                if (array [i][j] > max) {
//                    max = array [i][j];
//                }
//        }
//        System.out.println(max);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }

        System.out.println(count);


    }

}