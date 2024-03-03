package com.project.startingspringboot.controller;

import com.project.startingspringboot.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController
{
    @ExceptionHandler(value = NullPointerException.class)
    public ResponseEntity<User> nullPointerExceptionHandler()
    {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<User> jsonParserExceptionHandler()
    {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
