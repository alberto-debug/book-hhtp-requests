package com.code.bookRegistration.Controller;

import com.code.bookRegistration.model.Book;
import com.code.bookRegistration.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

   @PostMapping("/register")
   public ResponseEntity<Book> registerBook(@RequestBody Book book){
       Book  Registeredbook = bookService.registerBook(book);
       return ResponseEntity.ok(Registeredbook);
   }

   @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
       List<Book> books =  bookService.getAllBooks();
       if (books.isEmpty()){
           return ResponseEntity.noContent().build();

       }
       return ResponseEntity.ok(books);
   }

}
