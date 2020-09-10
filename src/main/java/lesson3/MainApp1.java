package lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


import java.util.Random;
import java.util.Scanner;


public class MainApp1 {
    protected static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        doGame();
    }

    private static void doGame() {
        System.out.println("\nGuess number from 1 to 9:");
        int attempt = 0;
        int userNum = 0;
        int compNum = 0;

        compNum = (int) (Math.random() * 10 + 1);

        do {
            System.out.println("Choose one number: ");
            userNum = in.nextInt();

            if (userNum == compNum) {
                System.out.println("You win!");
            } else if (userNum > compNum) {
                System.out.println("The number should be less");
            } else {
                System.out.println("The number should be greater");
            }
            attempt++;
        }
        while (userNum != compNum && attempt != 3);

        chooseActionEnd();
    }

    private static void chooseActionEnd() {
        System.out.println("Do you want to play again? 1-yes/0-no");


        switch (in.next()) {
            case "1":
                doGame();
                break;
            case "0":
                doExit();
                break;
        }
    }

    private static void doExit() {
        System.exit(0);
    }

}
