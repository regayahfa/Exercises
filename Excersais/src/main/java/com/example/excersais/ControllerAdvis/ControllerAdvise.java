package com.example.excersais.ControllerAdvis;

import com.example.excersais.ApiExciption.ApiException;
import com.example.excersais.Apirespons.Apirespons;
import com.example.excersais.Servies.BookServis;
import com.example.excersais.model.Book;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@ControllerAdvice
public class ControllerAdvise {


    @ExceptionHandler(value = ApiException.class)

    public ResponseEntity<Apirespons> ApiExcption(ApiException e)
    {
        String messege = e.getMessage();
        return ResponseEntity.status(400).body(new Apirespons(messege));
    }
}