package com.example.excersais.Servies;

import com.example.excersais.ApiExciption.ApiException;
import com.example.excersais.Rpostry.LibrartyRepstry;
import com.example.excersais.model.Book;
import com.example.excersais.model.Librarian;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibrarianServies {
    public final LibrartyRepstry librartyRepstry;

    public List<Librarian> getAlllibrarty() {

        return librartyRepstry.findAll();
    }

    public void addlibrirty(Librarian librarian) {
        librartyRepstry.save(librarian);
    }

    public Boolean updatelibrerty(Librarian librarian, Integer id) {
        Librarian librarian1 = librartyRepstry.save(librarian);
        if (librarian1 == null) {
            throw new ApiException("can't Update");
        }
        librarian1.setUsername(librarian1.getUsername());
        librartyRepstry.save(librarian1);
        return true;
    }

    public Librarian deletelibrarty(Integer id) {
        Librarian librarian = librartyRepstry.getLibrarianById(id);
        if (librarian == null) {
            throw new ApiException("not fuond");
        }
        return librarian;
    }

    public Librarian getById(Integer id) {
        Librarian librarian = librartyRepstry.getLibrarianById(id);
        return librarian;
    }

    public Librarian getByUsernameAndPass(String username, String pass) {
        Librarian librarian = librartyRepstry.findLoginLibrarianByUsernameAndPass(username, pass);
        if (librarian == null) {
            throw new ApiException("sorrry try agein");
        }
        return librarian;

    }
    public Librarian getByEmail(String email) {
        Librarian librarian = librartyRepstry.getLibrarianByEmail(email);
        return librarian;
    }

}

