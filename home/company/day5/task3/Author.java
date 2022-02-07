package home.company.day5.task3;

public class Author {
    String name;
    String email;
    String garden;

    public Author(String name, String email, String garden) {
        this.name = name;
        this.email = email;
        this.garden = garden;
    }

    public Author(String email,String name) {
        this.email = email;
        this.name = name;
    }



    public void write(){
        System.out.println("Author name = " + name + "Author email = " +
                email + "Author garden = " +garden);
    }
}
