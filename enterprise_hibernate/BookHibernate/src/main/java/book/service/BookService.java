package book.service;

import book.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> allBooks();
    void addBook(Book book);
    void deleteBook(Book book);
    void editBook(Book book);
    Book getById(int id);
}
