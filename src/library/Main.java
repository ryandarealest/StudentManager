package library;

import java.util.Date;
import library.book.Book;
import library.borrow.BorrowRecord;
import library.borrow.ReturnRecord;
import library.notification.Notification;
import library.search.Search;
import library.user.User;

public class Main {
    public static void main(String[] args) {
        //test
        // User test
        User user = new User();
        user.id = "U001";
        user.name = "Nguyen Van B";
        user.role = "Reader";
        user.showInfo();

        // Book test
        Book book = new Book();
        book.bookId = "B001";
        book.title = "Lap Trinh Python";
        book.quantity = 5;
        book.showBook();

        // Borrow
        BorrowRecord br = new BorrowRecord();
        br.userId = "U001";
        br.bookId = "B001";
        br.borrowDate = new Date();
        br.showRecord();

        // Return after 1 day
        Date returnAfter1Day = new Date(br.borrowDate.getTime() + 24L * 60 * 60 * 1000);

        ReturnRecord rr = new ReturnRecord();
        rr.userId = br.userId;
        rr.bookId = br.bookId;
        rr.returnDate = returnAfter1Day;
        rr.showReturn();

        // Notification
        Notification notify = new Notification();
        notify.userId = "U001";
        notify.type = "info";
        notify.message = "Ban da tra sach thanh cong";
        notify.send();

        // Search
        Search s = new Search();
        s.keyword = "Java";
        s.category = "Programming";
        s.doSearch();
    }
}
