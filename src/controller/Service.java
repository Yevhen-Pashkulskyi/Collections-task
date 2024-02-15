package controller;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class Service {
    //цей метод створює колекцію классу коричтувачів
    public List<User> createUsers() {

        // Це колеця типу arraylist з створими об'єктами класу user
        List<User> users = new ArrayList<>();
        users.add(new User("Анна","anna@gmail.com"));
        users.add((new User("Богдан", "bogdan@yahoo.com"));
        users.add(new User("Віктор", "viktor@outlook.com"));
        users.add(new User("Аліна", "alina@icloud.com"));
        users.add(new User("Дмитро", "dmytro@icloud.com"));

        return users;
    }
}
