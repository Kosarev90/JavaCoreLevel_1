package Lesson_5;

public class HomeWorkEmployee {

    public static final int MAX_AGE = 40;

    public static void main(String[] args) {


        Employee emp1 = new Employee("Jone", "Hoke", "assistant",
                "Jon2002@mail.ru", "8938321258", 1233.32, 23);
        Employee emp2 = new Employee("Jane", "Rok", "accountant",
                "Jullot@mail.ru", "8958442222", 982.23, 33);
        Employee emp3 = new Employee("Katrine", "Braun", "manager",
                "Braun33@mail.ru", "826663351", 785.44, 40);
        Employee emp4 = new Employee("Misha", "Smith", "loader",
                "Cool333@mail.ru", "8925561445", 852.12, 41);
        Employee emp5 = new Employee("Nick", "Hardy", "director",
                "Super2000@mail.ru", "8955115511", 4898.11, 55);


        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        for (Employee employee : employees) {
            if (employee.getAge() >= MAX_AGE) {
                employee.showEmp();
            }
        }
    }
}



