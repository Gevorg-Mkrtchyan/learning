package home.company.day5.task3;

public class Book {
    String name;
    Author author;
    int price;

    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public void bookInfo() {
        System.out.println("Book name =" + name + " Book author =" + author.name + "Book price" + price);
    }

    public void write() {
        System.out.println("Book name = " + name + " Author email = " + author.email);
    }
    public void allInfoBook(){
        System.out.println("Book name =" + name + " Book author =" + author.name + "Book price"
                + price +" Author email = " + author.email);
    }
}
