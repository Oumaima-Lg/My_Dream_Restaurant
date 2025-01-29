package ol.ma.My_Dream_Restaurant.service;


import ol.ma.My_Dream_Restaurant.repository.BookRepository;
import ol.ma.My_Dream_Restaurant.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(long id) {
        return bookRepository.findById(id);
    }

    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }
}
