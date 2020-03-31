package book.repository;

import book.entities.Book;

import java.util.List;

public interface BookDAO {
    List<Book> allBooks();
    void addBook(Book book);
    void deleteBook(Book book);
    void editBook(Book book);
    Book getById(int id);
}
