package lesson5.Array;

public class Person {
    protected String fullName;
    protected String position;
    protected String email;
    protected long tel;
    protected float salary;
    protected int age;

    public Person (String fullName, String position, String email, long tel, float salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() { return "Full name: " + fullName + "\nPosition: "+ position+ "\nE-mail: "+email + "\nTel: "+tel+"\nSalary: "+salary + "\nAge: "+age;
    }
}
