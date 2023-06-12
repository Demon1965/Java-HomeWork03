package HomeWorkOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Задать одномерный массив и найти в нем минимальный и максимальный элементы.

/*
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        for (int elem : array) {
            if (max < elem) max = elem;
            if (min > elem) min = elem;
        }
        System.out.println("minimum is " + min);
        System.out.println("maximum is " + max);
        }
    }*/


// 2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с
//помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//то есть [0][0], [1][1], [2][2], …, [n][n];



/*

        System.out.print("Please, insert the size of a matrix! ");
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());

        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            matrix[i][i] = 1;
            matrix[i][num - 1 - i] = 1;
            System.out.println(Arrays.toString(matrix[i]));
            }
    }
}
*/


//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59


/*

        System.out.print("Please, insert your name! ");
        Scanner scanner = new Scanner(System.in);
        String name = String.join(scanner.next());
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.parse("05:00")) && currentTime.isBefore(LocalTime.parse("11:59")))
            System.out.println("Good morning, " + name + "!");
        if (currentTime.isAfter(LocalTime.parse("12:00")) && currentTime.isBefore(LocalTime.parse("17:59")))
            System.out.println("Good day, " + name + "!");
        if (currentTime.isAfter(LocalTime.parse("18:00")) && currentTime.isBefore(LocalTime.parse("22:59")))
            System.out.println("Good evening, " + name + "!");
        if (currentTime.isAfter(LocalTime.parse("23:00")) && currentTime.isBefore(LocalTime.parse("04:59")))
            System.out.println("Good night, " + name + "!");
    }
}
*/



//4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
//при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
//нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами. */



        System.out.print("Please, insert the length of an array! ");
        Scanner scanner = new Scanner(System.in);
        int l = Integer.parseInt(scanner.next());
        System.out.print("Please, insert displacement of an array! ");
        int n = Integer.parseInt(scanner.next());
        if (n < 0) {
            n = l + n;
        }
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = (int) ((Math.random() * 20) - 5);
            System.out.print(array[i] + " ");
        }
        System.out.println("--- First Array");

        int count = 0;
        while (count < n) {
            count++;
            for (int z = 0; z < 1; z++) {
                int temp = array[z];
                for (int j = 0; j < l - 1; j++) {
                    array[j] = array[j + 1];
                    System.out.print(array[j] + " ");
                }
                array[l - 1] = temp;
                System.out.print(array[l - 1] + " ");
                System.out.println("--- Modified Array");
                }
            }
        }
    }

