package book.controller;

import book.entities.Book;
import book.service.BookService;
import book.service.BookServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class BookController {

    private BookService bookService= new BookServiceImplementation();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allBooks() {
        List<Book> books = bookService.allBooks();
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("books");
        modelView.addObject("bookList",books);
        return modelView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") int id) {
        Book book = bookService.getById(id);
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("editBook");
        modelView.addObject("book", book);
        return modelView;
    }

    @RequestMapping(value="/edit",method = RequestMethod.POST)
    public ModelAndView editBook(@ModelAttribute("book")Book book){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        bookService.editBook(book);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editBook");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addBook(@ModelAttribute("book") Book book){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        bookService.addBook(book);
        return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteBook(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        Book book = bookService.getById(id);
        bookService.deleteBook(book);
        return modelAndView;
    }
}