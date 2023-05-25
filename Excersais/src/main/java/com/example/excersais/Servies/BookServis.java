package com.example.excersais.Servies;

import com.example.excersais.ApiExciption.ApiException;
import com.example.excersais.Rpostry.BookRepostry;
import com.example.excersais.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServis {
    public final BookRepostry bookRepostry;

    public List<Book> getAllbook() {
        return bookRepostry.findAll();
    }

    public void addBook(Book book) {
        bookRepostry.save(book);
    }

    public Boolean updatebook(Book book, Integer id) {
        Book book1 = bookRepostry.getBookById();
        if (book1 == null) {
            throw new ApiException("can't Update");
        }
        book1.setTitle(book1.getTitle());
        bookRepostry.save(book1);
        return true;
    }

    public Book deleteBook() {
        Book oldbook = bookRepostry.getBookById();
        if (oldbook == null) {
            throw new ApiException("not fuond");
        }
        return oldbook;
    }

    public Book getBookBycategory(String category) {
        Book book = bookRepostry.findBookByCategory(category);
        if (book == null) {
            throw new ApiException("sorrry try agein");
        }
        return book;

    }

    public List<Book> getByNumberOfPages(Integer numberofpages) {
        List<Book> bookList = bookRepostry.getBookByNumberOfPages(numberofpages);
        if (numberofpages == null) {
            throw new ApiException("not found");
        }
        return bookList;
    }

    public Book getBookByAuthor(String Author) {
        Book book = bookRepostry.getBookByAuthor(Author);
        if (book == null) {
            throw new ApiException(" try agein");
        }
        return book;
    }
    public List<Book> getBookByTitle(String title) {
        List<Book> bookList = bookRepostry.getBookByTitle(title);
        if (title == null) {
            throw new ApiException("not found");
        }
        return bookList;
    }
}
