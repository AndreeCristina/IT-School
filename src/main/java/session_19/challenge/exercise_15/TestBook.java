package session_19.challenge.exercise_15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestBook {
    /* Given a list of books with attributes: title, author, and year of publication; use streams to find all
    the books published before the year 2000 and group them by author in a map where the key is the author and
    the value is a list of titles of their books. */

    public static void main(String[] args) {
        List<Book> listOfBooks = Arrays.asList(
                new Book("Adventures of Huckleberry Finn", "Mark Twain", 1998),
                new Book("A Pair of Schoolgirls", "Angela Brazil", 2000),
                new Book("Oliver Twist", "Charles Dickens", 2001),
                new Book("Adventures of Pinocchio", "Carlo Collodi", 1995),
                new Book("The Prince and the Pauper", "Mark Twain", 1997),
                new Book("The Mysterious Stranger", "Mark Twain", 2005),
                new Book("Bosom Friends", "Angela Brazil", 1999),
                new Book("The School by the Sea", "Angela Brazil", 1994),
                new Book("The Battle of Life", "Charles Dickens", 1998)
        );

        Map<String, List<String>> booksByAuthor = listOfBooks.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));

        booksByAuthor.forEach((author, titles) -> System.out.println(author + ": " + titles));
    }
}