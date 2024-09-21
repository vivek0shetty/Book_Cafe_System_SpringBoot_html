package com.example.BookRepository.controller;


import com.example.BookRepository.model.Book;
import com.example.BookRepository.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookConttroller {

@Autowired
    private Book_Repository bookRepository;


    @PostMapping("/insert")
    public ResponseEntity<Book>insert(@RequestBody Book book){
        Book book1= bookRepository.save(book);
        return  ResponseEntity.ok().body(book1);
    }

    @GetMapping("/gBook")
    public  ResponseEntity<List<Book>>getAllBooks(){
        List<Book> books = bookRepository.findAll();
        return ResponseEntity.ok().body(books);
    }

    @GetMapping("getI/{id}")
    public  ResponseEntity<Optional<Book>>getBookById(@PathVariable Long id){
        Optional<Book> book =bookRepository.findById(id);
        if(book.isPresent()){
            return  ResponseEntity.ok().body(book);
        }
        else {
            return  ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/delete/{id}")
    public  ResponseEntity<String> deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
        return ResponseEntity.ok().body("Deleted");
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            // Update other fields as needed
            Book updatedBookEntity = bookRepository.save(book);
            return ResponseEntity.ok().body(updatedBookEntity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }




}
