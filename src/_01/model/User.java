package _01.model;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }

    public String tostring() {
        return "Ім'я: " + name + ", Е-пошта: " + email;
    }
}
