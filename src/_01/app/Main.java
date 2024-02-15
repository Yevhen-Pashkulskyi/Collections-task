package _01.app;

import _01.view.Service;
import _01.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        List<User> users = service.createUsers();

        service.printUsers(users);
        service.printUserByIndex(users, 2);
    }
}
