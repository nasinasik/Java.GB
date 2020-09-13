package lesson5;

public class Main {
    public static void main(String[] args) {



        Employee emp1 = new Employee("Billy Butcher", "Butcher", "butcher@gmail.com", 555151525L, 2500.00f, 45 );
        Employee emp2 = new Employee("Hughie Campbell", "Campbell", "campbell@gmail.com", 555251515L, 500.00f, 32);
        Employee emp3 = new Employee("Annie January", "January", "January@gmail.com", 555251315L, 10000.00f, 25);
        Employee emp4 = new Employee("Mother's Milk", "Milk", "Milk@gmail.com", 555251425L, 1000.00f, 42);
        Employee emp5 = new Employee("Black Noir", "Noir", "Noir@gmail.com", 555251852L, 10000.00f, 38);

        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);
        System.out.println();
        System.out.println(emp3);
        System.out.println();
        System.out.println(emp4);
        System.out.println();
        System.out.println(emp5);

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        System.out.println(employees);



    }
}
