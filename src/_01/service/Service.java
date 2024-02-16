package _01.view;

import _01.model.User;

import java.util.ArrayList;
import java.util.List;

public class Service {
    //цей метод створює колекцію классу коричтувачів
    public List<User> createUsers() {

        // Це колеця типу arraylist з створими об'єктами класу user
        List<User> users = new ArrayList<>();
        users.add(new User("Анна", "anna@gmail.com"));
        users.add(new User("Богдан", "bogdan@yahoo.com"));
        users.add(new User("Віктор", "viktor@outlook.com"));
        users.add(new User("Аліна", "alina@icloud.com"));
        users.add(new User("Дмитро", "dmytro@icloud.com"));

        return users;
    }

    //     цей метод друкує усіх користувачів
    public void printUsers(List<User> users) {
        System.out.println("Користувачі чату: ");
        int count = 0;
        for (User user : users) {
            count++;
            System.out.println(count + ") " + user.tostring());
        }
    }

    // цей метод друкує користувача за конкретним індексом
    // або видає помилку якщо не вірний індекс
    public void printUserByIndex(List<User> users, int index) {
        if (index > 0 && index < users.size()) {
            System.out.println("\nКористувач за індексом " + index + "\n"
                    + users.get(index).tostring());
        } else {
            System.out.println("Невірний індекс. Індекс повинен бути від 0 до "
                    + (users.size() - 1));
        }
    }

}
