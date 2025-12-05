package library.notification;

public class Notification {
    public String userId;
    public String message;
    public String type;

    public void send() {
        System.out.println("[NOTIFICATION] (" + type + ") To User " + userId + ": " + message);
    }
}
