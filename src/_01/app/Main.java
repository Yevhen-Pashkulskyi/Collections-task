package _01.app;

import _01.service.Service;
import _01.model.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Service service = new Service();

        List<User> users = service.createUsers();

        service.printUsers(users);

        System.out.println("\nПошук користувача за індексом \n" + "Введіть індекс від 0 до "
                + (users.size() - 1) + ": ");
        int index = scanner.nextInt();
        service.printUserByIndex(users, index);
    }

}
