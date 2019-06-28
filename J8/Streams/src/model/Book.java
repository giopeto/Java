package model;

public class Book {

    private int id;
    private String title;
    private int authorId, year;

    public Book(int id, String title, int authorId, int year) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int author) {
        this.authorId = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorId='" + authorId + '\'' +
                ", year=" + year +
                '}';
    }
}
