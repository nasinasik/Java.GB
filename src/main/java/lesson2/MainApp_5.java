package lesson2;

import java.util.Arrays;

public class MainApp_5 {


    public static void main(String args[]) {

        int[] arr = {1, 5, 7, 3, 9};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min value:" + min);
        System.out.println("max value:" + max);
    }
}

