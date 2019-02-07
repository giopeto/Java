import model.Author;
import model.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static final String STEPHEN_KING = "Stephen King";
    public static final String TERRY_PRATCHETT = "Terry Pratchett";
    public static final int STEPHEN_KING_ID = 1;
    public static final int TERRY_PRATCHETT_ID = 2;

    public static void main(String[] args) {
        List<Author> authors = getAllAuthors();
        List<Book> books = getAllBooks();

        List<Book> terryPratchettBooks = getTerryPratchettBooks(books);
        List<Integer> stephenKingBookIds = getStephenKingBookIds(books);

        List<Author> authorsWithBooks = mapAuthorToBooks(authors, books);
        System.out.println(authorsWithBooks.toString());
    }

    private static List<Integer> getStephenKingBookIds(List<Book> books) {
        List<Integer> stephenKingBookIds = books.stream().
                filter(book -> book.getAuthorId() == STEPHEN_KING_ID).
                map(book -> book.getId()).
                collect(Collectors.toList());
        System.out.println(stephenKingBookIds);

        return stephenKingBookIds;
    }

    private static List<Book> getTerryPratchettBooks(List<Book> books) {
        List<Book> terryPratchettBooks = books.stream().
                filter(book -> book.getAuthorId() == TERRY_PRATCHETT_ID).
                collect(Collectors.toList());
        System.out.println(terryPratchettBooks.toString());

        return terryPratchettBooks;
    }

    private static List<Author> mapAuthorToBooks(List<Author> authors, List<Book> books) {
        return authors.stream().
                map(author -> mapBookToAuthor(author, books)).
                collect(Collectors.toList());
    }

    private static Author mapBookToAuthor(Author author, List<Book> books) {
        author.setBookTitlesList(Optional.of(
                books.stream().
                        filter(book -> book.getAuthorId() == author.getId()).
                        map(book -> book.getTitle()).
                        collect(Collectors.toList())));

        return author;
    }

    private static List<Author> getAllAuthors() {
        return Arrays.asList(
                new Author(STEPHEN_KING_ID, STEPHEN_KING),
                new Author(TERRY_PRATCHETT_ID, TERRY_PRATCHETT)
        );
    }

    private static List<Book> getAllBooks() {
        return Arrays.asList(
                new Book(1, "The Compleat Discworld Atlas", TERRY_PRATCHETT_ID, 2015),
                new Book(2, "The Long Walk", STEPHEN_KING_ID, 1979),
                new Book(3, "Turtle Recall", TERRY_PRATCHETT_ID, 2015),
                new Book(4, "The Science of Discworld IV: Judgement Day", TERRY_PRATCHETT_ID, 2013),
                new Book(5, "Pet Sematary", STEPHEN_KING_ID, 1983),
                new Book(6, "Finders Keepers", STEPHEN_KING_ID, 2015)
        );
    }
}
