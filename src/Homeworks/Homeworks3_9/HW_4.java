package Homeworks.Homeworks3_9;

public class HW_4 {
    public static void main(String[] args) {
        // Задача №1 Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         //необходимо вывести все нечетные числа из массива.

        System.out.println("Результаты");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value % 2 != 0) {
                System.out.println("Задача 1/нечетные " + value );
            }

        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value > 5) {
                System.out.println("Задача 2/ те, что больше 5 " + value);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int value = array[i] + 15;
            System.out.println(" Задача 3,увеличение на 15 " + " " + value);

        }
        System.out.println(" Задача 3/ альтернативный вариант решения ");
        for (int value:array) { // альтернативный вариант
            System.out.println("Увеличение на 15 " + " = " + (value + 15));
        }

        System.out.println("Задача 4");

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'о') {
                System.out.println("Найдена буква 'о' на позиции " + i);
            }
        }


    }



    // Задача №4 Дана строка: String s = “Перестановочный алгоритм быстрого действия”;
    // необходимо вывести все буквы “о” из этой строки.
    // Для указанной строки ответ будет “ооооо” (или в столбик)


    // Задача №5 Дана строка: String s = “Перевыборы выбранного президента”;
    // необходимо подсчитать количество букв “е” в строке.
    // Для указанной строки ответ будет 4.


    // Задача №6 Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    // необходимо вывести сумму всех значений массива.


}

