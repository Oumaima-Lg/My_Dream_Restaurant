package ol.ma.My_Dream_Restaurant.controller;

import ol.ma.My_Dream_Restaurant.service.BookService;
import ol.ma.My_Dream_Restaurant.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book-list"; 
    }

    // Afficher le formulaire pour ajouter un nouveau livre
    @GetMapping("/new")
    public String showNewBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    @PostMapping
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/edit/{id}")
    public String editBookForm(@PathVariable Long id, Model model) {
        // Optional<Book> book = bookService.getBookById(id);
        // if (book.isPresent()) {
        //     model.addAttribute("book", book.get());
        //     return "books/edit";
        // }
        // return "redirect:/books";
        model.addAttribute("book", bookService.getBookById(id).orElseThrow(() -> new RuntimeException("Book not found"))); 
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateBook(@PathVariable Long id, @ModelAttribute Book book) {
        book.setId(id);
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}
