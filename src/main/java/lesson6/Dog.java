package lesson6;

public class Dog extends Animal {
    int maxRun = random(1000);
    int maxSwim = random(100);
    double maxJump = random(10);

    public Dog(String name) {
        super(name);
        this.name = name;
        System.out.println(this.name + "\ncan run for: " + maxRun + "\ncan swim for: " + maxSwim + "\ncan jump for: " + maxJump);
    }

    @Override
    public void swim(int s) {
        System.out.println(this.name + " activity: swim for: " + s + " result: " + (s <= maxSwim));
    }

    public void run(int r) {
        System.out.println(this.name + " activity: run for: " + r + " result: " + (r <= maxRun));
    }

    public void jump(double j) {
        System.out.println(this.name + " activity: Jump for: " + j + " result: " + (j <= maxJump));
    }
}
