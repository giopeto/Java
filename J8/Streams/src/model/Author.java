package model;

import java.util.List;
import java.util.Optional;

public class Author {

    private int id;
    private  String name;
    private Optional<List<String>> bookTitlesList;

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<List<String>> getBookTitlesList() {
        return bookTitlesList;
    }

    public void setBookTitlesList(Optional<List<String>> bookTitlesList) {
        this.bookTitlesList = bookTitlesList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookTitlesList=" + bookTitlesList +
                '}';
    }
}
