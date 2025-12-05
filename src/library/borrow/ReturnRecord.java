package library.borrow;

import java.util.Date;

public class ReturnRecord {
    public String userId;
    public String bookId;
    public Date returnDate;

    public void showReturn() {
        System.out.println("Return: User=" + userId + ", Book=" + bookId + ", Date=" + returnDate);
    }
}
