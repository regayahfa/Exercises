package com.example.excersais.Rpostry;

import com.example.excersais.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrartyRepstry extends JpaRepository<Librarian,Integer> {
Librarian getLibrarianById(Integer id);

Librarian findLoginLibrarianByUsernameAndPass(String username,String pass);

Librarian getLibrarianByEmail(String Email);
}
