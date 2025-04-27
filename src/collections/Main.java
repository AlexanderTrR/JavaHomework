package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("War and peace", 5000, 1867);
        Book book2 = new Book("Crime and Punishment", 561, 1866);
        Book book3 = new Book("Harry Potter and the Deathly Hallows", 352, 2007);
        Book book4 = new Book("Bear's Corner", 704, 2016);
        Book book5 = new Book("Harry Potter and the Prisoner of Azkaban", 322, 1999);
        Book book6 = new Book("Harry Potter and the Goblet of Fire", 488, 2000);
        Book book7 = new Book("Harry Potter and the Order of the Phoenix", 678, 2003);
        Book book8 = new Book("Harry Potter and the Half-Blood Prince", 752, 2005);
        Book book9 = new Book("Cherry Orchard", 121, 1904);
        Book book10 = new Book("Woe from mind", 222, 1825);
        Book book11 = new Book("Viy", 82, 1835);
        Book book12 = new Book("Metro 2033", 457, 2005);
        Book book13 = new Book("Alchemist", 657, 1988);
        Book book14 = new Book("Wellness", 121, 2024);
        Book book15 = new Book("A Thousand Shining Suns", 559, 2007);
        Book book16 = new Book("The Kite Runner", 620, 2003);

        List<Book> setOfBooks1 = new ArrayList<Book>();
        setOfBooks1.add(book1);
        setOfBooks1.add(book2);
        setOfBooks1.add(book3);
        setOfBooks1.add(book4);
        setOfBooks1.add(book5);
        List<Book> setOfBooks2 = new ArrayList<Book>();
        setOfBooks2.add(book3);
        setOfBooks2.add(book5);
        setOfBooks2.add(book6);
        setOfBooks2.add(book7);
        setOfBooks2.add(book8);
        List<Book> setOfBooks3 = new ArrayList<Book>();
        setOfBooks3.add(book4);
        setOfBooks3.add(book9);
        setOfBooks3.add(book10);
        setOfBooks3.add(book11);
        setOfBooks3.add(book12);
        List<Book> setOfBooks4 = new ArrayList<Book>();
        setOfBooks4.add(book13);
        setOfBooks4.add(book14);
        setOfBooks4.add(book15);
        setOfBooks4.add(book1);
        setOfBooks4.add(book2);
        setOfBooks4.add(book16);

        Student Petr = new Student("Petr");
        Student Viktor = new Student("Viktor");
        Student Nikolay = new Student("Nikolay");
        Student Dmitry = new Student("Dmitry");

        Petr.setBooks(setOfBooks1);
        Viktor.setBooks(setOfBooks2);
        Nikolay.setBooks(setOfBooks3);
        Dmitry.setBooks(setOfBooks4);

        List<Student> students = new ArrayList<Student>();
        students.add(Petr);
        students.add(Viktor);
        students.add(Nikolay);
        students.add(Dmitry);

        students.stream()
                .peek(Student -> System.out.println(Student.toString()))
                .map(Student::getBooks)
                .flatMap(books -> books.stream())
                .sorted(Comparator.comparing(Book::getPageCount))
                .distinct()
                .filter(book -> book.getYearOfPublication() > 2000)
                .limit(3)
                .peek(book -> book.getYearOfPublication())
                .min(Comparator.comparing(Book::getPageCount))
                .ifPresent(book -> System.out.println(book.getYearOfPublication()));

    }
}
