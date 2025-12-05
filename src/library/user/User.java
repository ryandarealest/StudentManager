package library.user;

public class User {
    public String id;
    public String name;
    public String role;

    public void showInfo() {
        System.out.println("User: " + id + " - " + name + " (" + role + ")");
    }
}
