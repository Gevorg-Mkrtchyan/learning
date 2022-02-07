package home.company.day5.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("King", new Author("@Jhon.com", "Jhon"), 1250);
        Book book2 = new Book("KIng ", new Author(" @gmail.com", "Bob"));
        Book book3 = new Book("Queen ", new Author("@gmail.com ", "Bob"));
        Book book4 = new Book("History", new Author("@qwerty.com", "Jhon"), 125);
        book1.bookInfo();
        book2.showResult();
        book3.showResult();
        book4.allInfoBook();
    }
}
