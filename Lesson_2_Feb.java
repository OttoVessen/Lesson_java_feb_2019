import java.util.Arrays;

public class Lesson_2_Feb {

    public static void main(String[] args) {

        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < binaryArray.length; i++) {

            if (binaryArray[i] == 0) {
                binaryArray[i] = 1;
            } else {
                binaryArray[i] = 0;
            }


        }

        /*2. Задать пустой целочисленный массив размером 8. С помощью цикла
        заполнить его значениями 0 3 6 9 12 15 18 21;*/

        int[] threeAr = new int[8];

        for (int a = 0; a < threeAr.length; a++) {
            threeAr[a] = a * 3;
        }


        /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        циклом, и числа меньшие 6 умножить на 2;*/

        int[] arrD = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int t = 0; t < arrD.length; t++) {

            if (arrD[t] < 6) {
                arrD[t] *= 2;

            }
        }

        /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        цикла(-ов) заполнить его диагональные элементы единицами;*/

        int[][] arrT = new int[4][4];

        for (int k = 0; k < arrT.length; k++) {
            arrT[k][k] = 1;
        }

        /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
        (без помощи интернета); */


        int[] minMax = {3, 57, 79, 9, 92, 0};
        int min = minMax[0];
        int max = min;
        for (int l = 0; l < minMax.length; l++) {

            if (minMax[l] > max) {
                max = minMax[l];

            }

            if (minMax[l] < min) {
                min = minMax[l];
            }
        }
    }



    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.*/


    public static boolean checkBalance(int[] arr) {
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {

            summ += arr[i];
        }
        boolean r = false;
        int sumL = 0;
        int sumR = 0;
        for (int j = 0; j < arr.length; j++) {

            sumL += arr[j];
            sumR = summ - sumL;
            if (sumL == sumR) {

                r = true;
                return r;
            }
        }
        return r;
    }

    /*7. **** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все
     элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/

    public static void arrMove(int[] arr, int n) {

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int k = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = k;
            }
        } else if (n < 0) {

            n *= -1;

            for (int i = arr.length; i > n; i--) {
                int k = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = k;
            }
        }
    }
}



