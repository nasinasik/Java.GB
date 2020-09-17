package lesson6;

public abstract class Animal {

    protected String name;

    public abstract void jump(double j);

    public abstract void swim(int s);

    public abstract void run(int r);

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Animal name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static int random(int var) {
        return (int) (Math.random() * var + 1);
    }
}

