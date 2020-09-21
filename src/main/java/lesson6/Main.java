package lesson6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Prrrrr");
        Dog dog = new Dog("Barry");
        Dog dog1 = new Dog("Bobik");
        cat.printInfo();
        System.out.println();
        dog.printInfo();
        System.out.println();
        cat.jump(2);
        cat.swim(0);
        cat.run(200);
        dog.jump(0.5);
        dog.run(500);
        dog1.run(400);
        dog.swim(10);

    }


}


