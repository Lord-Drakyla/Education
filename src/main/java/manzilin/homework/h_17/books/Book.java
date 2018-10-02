package manzilin.homework.h_17.books;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Book implements Serializable {
    private static final long serialVersionUID = -1563820713827342072L;
    private String title;
    private String author;

    private LocalDate yearPublication;
    private long ISBN;

    protected Book(String title, String author, LocalDate yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(LocalDate yearPublication) {
        this.yearPublication = yearPublication;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return a String representation of this object on multiple lines
     *         (primarily to be used for debugging and logging)
     */
    public String toPrint() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n   author: "          + this.author);
        sb.append("\n   title: "           + this.title);
        sb.append("\n   ISBN: "             + this.ISBN);
        sb.append("\n   yearPublication: "  + this.yearPublication);
        return sb.toString();
    }

}
