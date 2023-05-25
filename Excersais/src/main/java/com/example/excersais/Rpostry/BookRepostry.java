package com.example.excersais.Rpostry;

import com.example.excersais.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepostry extends JpaRepository<Book, Integer> {

    Book getBookById();
    Book findBookByCategory(String category);
    @Query("SELECT numberOfPages from Book where numberOfPages>300")
    List<Book> getBookByNumberOfPages(Integer NumberOfPages);

    Book getBookByAuthor(String Author);
    @Query("select title from Book WHERE title=?")
    List<Book>getBookByTitle(String title);
}
