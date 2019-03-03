import java.text.MessageFormat;

public class Worker {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;


    public Worker() {

        name = "Н/У";
        position = "Н/У";
        email = "Н/У";
        phoneNumber = "Н/У";
        salary = 999;
        age = 999;
    }

    public Worker(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(MessageFormat.format("Имя: {0}, Должность: {1}, email: {2}, Номер телефона: {3}, Зарплата: {4}, Возраст: {5}",
                name, position, email, phoneNumber, salary, age));

    }

}
