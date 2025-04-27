package collections;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Book> books = new ArrayList<Book>();

    public Student(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String info = "Student [name=" + name + "]";
        return info;

    }
}