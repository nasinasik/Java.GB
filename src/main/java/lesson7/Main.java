package lesson7;

public class Main {


    public static void main(String[] args) {
       /* Cat cat = new Cat("Мартин", 5);
        Plate plate = new Plate();*/
        Cat[] cats = {
                new Cat("Boris", 4),
                new Cat("Moris", 3),
                new Cat("Doris", 6),
                new Cat("Vanya", 7)
        };

        Plate[] plates = {
                new Plate(),
                new Plate(),
                new Plate(),
                new Plate(),

        };
        refillPlates(plates);

  /*        plate.info();
        cat.eat(plate);

        plate.info();
        plate.addFood(7);
        plate.info();
        cat.eat(plate);
        plate.info();
      System.out.println();
        plate.info();
        cats[0].eat(plate);
        plate.info();
        plate.addFood(3);
        plate.info();
        cats[0].eat(plate);
        plate.info();
*/
    }

    public static void refillPlates(Plate[] plates) {
        for (Plate plate : plates) {
            plate.addFood(10);
        }
    }

}

