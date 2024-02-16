package _02.controller;

import _02.model.User;
import _02.service.UserCollection;

import java.util.Scanner;

public class Run {
    public void runPrograms() {
        //todo треба зробити додавання юзера через цикл та його список мав ліміт
        // наприклад 100 користувачів але вивдоли по запиту тількі ті які є

        // todo зробити окремий фунціонал для вибора дії яку треба зробити

        Scanner scanner = new Scanner(System.in);
        UserCollection userCollection = new UserCollection();
        // Додавання користувачів до колекції
        userCollection.addUser(new User("John Doe", "john@example.com"));
        userCollection.addUser(new User("Alice Smith", "alice@example.com"));
        userCollection.addUser(new User("Bob Johnson", "bob@example.com"));
        userCollection.addUser(new User("Emily Brown", "emily@example.com"));
        userCollection.addUser(new User("Michael Wilson", "michael@example.com"));

        // Виведення всіх користувачів
        System.out.println("All users:");
        userCollection.printUsers();

        // Виведення користувача за певним індексом
        System.out.println("Пошук коритсувача за індексом.\n"
                + "Введіть індекс для пошуку: ");

        int index = scanner.nextInt();
        System.out.println("\nUser at index " + index + ":");
        User user = userCollection.getUser(index - 1);
        if (user != null) {
            System.out.println(user.tostring());
        } else {
            System.out.println("No user found at index " + index);
        }
    }
}
