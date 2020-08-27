package ru.geekbrains.lesson1;

public class JavaApp {
    public static void main(String[] args) {
        int var1 = 15;
        long var2 = 1500000L;
        float var3 = 45.25f;
        double var4 = 7.5;
        char var5 = 'ח';
        boolean var6 = false;
        System.out.println(example(5.3f, 3.0f, 15.7f, 0.15f));
        System.out.println(sum(8, 8));
        hw5(9);
        System.out.println(hw6(15));
        hw7("Matt");



    }

    public static float example(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean sum(int e, int f) {
        if (10 <= (e + f) && (e + f) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void hw5 (int g) {
        if (g >= 0) {
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }

    }
    public static boolean hw6 (int h) {
        if (h >= 0){
            return false;
        } else {
            return true;
        }
    }

    public static void hw7 (String name) {
        System.out.println("hello " + name + "!");
    }
}
