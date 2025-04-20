package collections;

public class Book {
    private String title;
    private int pageCount;
    private int yearOfPublication;

    public Book(String title, int pageCount, int yearOfPublication) {
        this.title = title;
        this.pageCount = pageCount;
        this.yearOfPublication = yearOfPublication;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        String info = "Book [title=" + title + ", pageCount=" + pageCount + ", yearOfPublication=" + yearOfPublication + "]";
        return info;

    }
}
