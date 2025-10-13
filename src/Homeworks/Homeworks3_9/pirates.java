package Homeworks.Homeworks3_9;

public class pirates {

    public static void main(String[] args) {
        //Создать программу дележа добычи на пиратском корабле.
        // По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
        // остальное делится поровну между всеми членами команды, включая капитана.
        // Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
        //Вывести на экран кому сколько пиастров полагается
        //Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?

//        int a = 1000; // добыча в пиастрах
//        int b = (a / 2); // часть сокровищ, которая принадлежит владельцу корабля
//        int c1 = (a - b); // оставшаяся часть сокровищ
//        int c = (c1 / 2); //часть сокровищ, принадлежащая капитану
//        int d1 = (c1 - c); //часть сокровищ которая осталась после вычета капитанской доли
//        int Homeworks.Homeworks3_9.pirates = 15; // количество пиратов в команде
//        int d = (d1 / Homeworks.Homeworks3_9.pirates);
//        System.out.println("Часть добычи, принадлежащая капитану  " + c);
//        System.out.println("Часть добычи, деленая на каждого члена команды  " + d);
//        System.out.println("Часть добычи, принадлежащая владельцу корабля  " + b);

//        Задача 1: Проверка email-адресов
//        Условие: Вывести все email-адреса, которые:
//        содержат "admin"
//        заканчиваются на "@gmail.com"
//      Подсказка: contains("admin") && endsWith("@gmail.com")

//
//        String[] emails = {
//                "admin@gmail.com",
//                "user123@yahoo.com",
//                "test.admin@outlook.com",
//                "admin@myrealgmail.com",
//                "coolgirl@gmail.com",
//                "support@company.com",
//                "admin123@gmail.com",
//                "hello.world@protonmail.com",
//                "tester.admin@gmail.com",
//                "admin@fakegmail.net",
//                "admin$gmail.com",
//                "admin@company.org"}
//        };
//
//        for (int i = 0; i < emails.length; i++) {
//            String[] parts = emails[i].split("@");
//            if (parts.length == 2 && parts[0].equals("admin") && parts[1].equals("gmail.com")) {
//                System.out.println("Подходит: " + emails[i]);
//            }
//            }
//         }



        int[][] matrix = {
                {12, -5, 123, 7, 88},
                {-99, 0, 45, 999, -1},
                {3, 17, -42, 8, 76},
                {100, -23, 5, 6, 77},
                {9, 222, -88, 11, 0}
        };

        System.out.print("Главная диагональ: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        System.out.print("Побочная диагональ: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }




    }
}




