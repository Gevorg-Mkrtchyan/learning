package home.company.day5.task3;

/**
 * 3. Define Author class which
 *  Has fields name, email, gender
 *  define all argument constructor
 *  write method which will print all information about Author
 *  create an instance of Author and print all info about him
 */
public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String email, String name) {
        this.email = email;
        this.name = name;
    }


    public void allInfoAuthor() {
        System.out.println("Author name = " + name + "Author email = " +
                email + "Author garden = " + gender);
    }
}
