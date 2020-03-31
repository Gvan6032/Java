package book.service;

import book.entities.Book;
import book.repository.BookDAO;
import book.repository.BookDAOImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    private BookDAO bookDAO= new BookDAOImplementation();

    @Override
    public List<Book> allBooks() {
        return bookDAO.allBooks();
    }

    @Override
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookDAO.deleteBook(book);
    }

    @Override
    public void editBook(Book book) {
        bookDAO.editBook(book);
    }

    @Override
    public Book getById(int id) {
        return bookDAO.getById(id);
    }
}
