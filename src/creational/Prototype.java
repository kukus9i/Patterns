package creational;

public interface Prototype {
    Object clone();
}
class Book implements Prototype {
    private String name;
    private String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Object clone() {
        Book clone = new Book(name, author);
        return clone;
    }

    public String toString() {
        return "Book name:\t" + name + "\nBook author:\t" + author;
    }
}