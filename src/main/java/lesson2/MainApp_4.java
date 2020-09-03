package lesson2;

import java.util.Arrays;


public class MainApp_4 {
    public static void main(String args[]) {
      /*  System.out.println(Arrays.deepToString( fillArr(10, 10))
                .replace("],", "]\n")
                .replace("]", "")
                .replace("[", " ")
        );*/
        fillArr(10, 10);
    }

    public static void fillArr(int h, int w) {
        int[][] table = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == j || h - i == j + 1) {
                    table[i][j] = table[i][h - i - 1] = 2;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
