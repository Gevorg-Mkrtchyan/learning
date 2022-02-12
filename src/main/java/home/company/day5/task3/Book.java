package home.company.day5.task3;

/**
 * Define Book class which
 *  Has fields name, author, price
 *  define all argument constructor
 *  write method which will print all information about Book
 *  write methods which will print name and email of the author
 *  create 2 instances of Book, which has same author
 *  print all info about books
 */
public class Book {
    String nameBook;
    Author author;
    int price;

    public Book(String nameBook, Author author, int price) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
    }

    public void bookInfo() {
        System.out.println((" Book name = " + nameBook + " Book price = " + price));
    }

    public void showResult() {
        System.out.println(" name = " + nameBook + " Author email = " + author.email);
    }

    public void allInfoBook() {
        System.out.println(" name = " + nameBook + " Book author =" + author.name + "Book price ="
                + price + " Author email = " + author.email);
    }
}
