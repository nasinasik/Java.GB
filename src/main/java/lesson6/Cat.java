package lesson6;

public class Cat extends Animal {
    int maxRun = 200;

    double maxJump = 2;

    public Cat(String name) {
        super(name);
        this.name = name;

    }


    @Override
    public void swim(int s) {
        System.out.println(this.name +" can't swim");

    }

    public void run(int r) {
        System.out.println( this.name + "'s activity type: run " + "result: " + (r <= maxRun));
    }

    public void jump(double j) {
        System.out.println(this.name + "'s activity type: jump " + "result: " + (j <= maxJump));
    }


}
