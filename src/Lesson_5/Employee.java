package Lesson_5;

public class Employee {

    String name;
    String surname;
    String post;
    String email;
    String number;
    double salary;
    int age;

    public Employee(String name, String surname, String post, String email, String number, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void showEmp() {
        System.out.println("Name: " + name + "\nSurname: " + surname +
                "\nProfession: " + post + "\nEmail: " + email +
                "\nNumber phone" + number + "\nSalary: " + salary + "\nAge: " + age);
    }

}