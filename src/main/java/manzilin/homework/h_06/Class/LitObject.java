package manzilin.homework.h_06.Class;

import java.time.LocalDate;
import java.util.Arrays;

public class LitObject {
    private String bookTitle;
    private Integer[] chapters; // главы где упоминается объект
    private String author;
    private LocalDate yearPublish;

    public LitObject() {
            }

    public LitObject(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;

    }

    public LitObject(String bookTitle, String author, LocalDate yearPublish) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublish = yearPublish;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Integer[] getChapters() {
        return chapters;
    }

    public void setChapters(Integer[] chapters) {
        this.chapters = chapters;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(LocalDate yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "LitObject{" +
                "bookTitle='" + bookTitle + '\'' +
                ", chapters=" + Arrays.toString(chapters) +
                ", author='" + author + '\'' +
                ", yearPublish=" + yearPublish +
                '}';
    }
}

