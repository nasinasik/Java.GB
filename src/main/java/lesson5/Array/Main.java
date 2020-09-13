package lesson5.Array;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        newArray();
    }

    public static void newArray() {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Billy Butcher", "Butcher", "butcher@gmail.com", 555151525L, 2500.00f, 45);
        persArray[1] = new Person("Hughie Campbell", "Campbell", "campbell@gmail.com", 555251515L, 500.00f, 32);
        persArray[2] = new Person("Annie January", "January", "January@gmail.com", 555251315L, 10000.00f, 25);
        persArray[3] = new Person("Mother's Milk", "Milk", "Milk@gmail.com", 555251425L, 1000.00f, 42);
        persArray[4] = new Person("Black Noir", "Noir", "Noir@gmail.com", 555251852L, 10000.00f, 38);

        for (Person person : persArray) {
            if (person.age > 40) {
                System.out.println(person);
                System.out.println();
            }

        }


    }
}
