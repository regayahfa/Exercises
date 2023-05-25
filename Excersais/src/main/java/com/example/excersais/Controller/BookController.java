package com.example.excersais.Controller;

import com.example.excersais.Servies.BookServis;
import com.example.excersais.model.Book;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookServis bookServis;

    @GetMapping("/get")
    public ResponseEntity getAllBook(){
        List<Book> bookList=bookServis.getAllbook();
        return ResponseEntity.status(200).body("BOOK");
    }
    @PostMapping("/add")
    public ResponseEntity addBook(@Valid @RequestBody Book book){
       bookServis.addBook(book);
       return ResponseEntity.status(200).body("book adeed");
    }
    @PostMapping("/update")
   public ResponseEntity updateBook(@Valid @RequestBody Book book, @PathVariable Integer id){
        boolean book1=bookServis.updatebook(book,id);
        return ResponseEntity.status(200).body("Saccess");
   }
   @PostMapping ("/delete")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
        Book book=bookServis.deleteBook();
        return ResponseEntity.status(200).body("can't deleted sorry..");
    }
    @GetMapping("/get-category")
    public Book getBookBycategory(String category){
        Book book=bookServis.getBookBycategory(category);
        return book;
    }
    @GetMapping("/get-numberpages")
    public ResponseEntity getByNumberOfPages(@PathVariable Integer numberofpages){
        List<Book>bookList=bookServis.getByNumberOfPages(numberofpages);
        return ResponseEntity.status(200).body(numberofpages);
    }

    @GetMapping("/get-Author")
    public Book getBookByAuthor(String Author) {
        Book book = bookServis.getBookByAuthor(Author);
        return book;

    }
    @GetMapping("/get-title")
    public ResponseEntity getByTitle(@Valid @RequestBody String title){
        List<Book>bookList=bookServis.getBookByTitle(title);
        return ResponseEntity.status(200).body(title);
    }


}