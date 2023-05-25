package com.example.excersais.ApiExciption;

public class ApiException extends RuntimeException{
    public ApiException(String messege){
        super(messege);
    }
}
