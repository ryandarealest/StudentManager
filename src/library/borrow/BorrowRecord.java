package library.borrow;

import java.util.Date;

public class BorrowRecord {
    public String userId;
    public String bookId;
    public Date borrowDate;

    public void showRecord() {
        System.out.println("Borrow: User=" + userId + ", Book=" + bookId + ", Date=" + borrowDate);
    }
}
