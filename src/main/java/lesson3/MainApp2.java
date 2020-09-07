package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainApp2 {
    protected static Scanner in = new Scanner(System.in);
    protected static List<String> words = Arrays.asList("apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato");
    protected static Random rand = new Random();

    public static void main(String[] args) {
        guessGame();
    }

    private static void guessGame() {

        System.out.println(words);
        int randomIndex = rand.nextInt(words.size());
        String randomWord = words.get(randomIndex);
        String userWord = "";
        do {
            System.out.println("Guess the word: ");
            userWord = in.next();
            String answer = "";
            answer = "";

            for (int i = 0; i < randomWord.length(); i++) {
//                System.out.println("randomWord: " + randomWord.length() + " userWord: " + userWord.length() + " i :" + i);
                if (randomWord.charAt(i) == userWord.charAt(i)) {
                    answer = answer + userWord.charAt(i);
                } else {
                    answer = answer + "#";
                }

            }
            if (!randomWord.equals(userWord)) {
                for (int j = answer.length(); j < 15; j++) {
                    answer = answer + "#";
                }
                System.out.println(answer);
            }
        } while (!randomWord.equals(userWord));

        System.out.println("YEY, u got it : " + randomWord);

    }
}
