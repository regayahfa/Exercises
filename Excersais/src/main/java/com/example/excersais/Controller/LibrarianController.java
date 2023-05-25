package com.example.excersais.Controller;

import com.example.excersais.Servies.LibrarianServies;
import com.example.excersais.model.Book;
import com.example.excersais.model.Librarian;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/libubrty")
public class LibrarianController {
    private final LibrarianServies librarianServies;

    @GetMapping("/get")
    public ResponseEntity getAlllibrarian(){
        List<Librarian> librarians=librarianServies.getAlllibrarty();
        return ResponseEntity.status(200).body("good");
    }
    @PostMapping("/add")
    public ResponseEntity addlibrarian(@Valid @RequestBody Librarian librarian){
       librarianServies.addlibrirty(librarian);
        return ResponseEntity.status(200).body("great added");
    }
    @PostMapping("/update")
    public ResponseEntity updatelibrarian(@Valid @RequestBody Librarian librarian, @PathVariable Integer id){
        boolean librarian1=librarianServies.updatelibrerty(librarian,id);
        return ResponseEntity.status(200).body("Saccess");
    }
    @PostMapping ("/delete")
    public ResponseEntity<String> deletelibrartian(@PathVariable Integer id) {
       Librarian librarian=librarianServies.deletelibrarty(id);
        return ResponseEntity.status(200).body("can't deleted sorry..");
    }
    @GetMapping("/get-ID")
    public Librarian getBookById(Integer id) {
        Librarian librarian=librarianServies.getById(id);
        return librarian;
    }


}
