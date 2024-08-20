package com.estudo.curso.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.estudo.curso.services.exceptions.ResouseNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResurceExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StandartError> resouceNotFound(ResouseNotFoundException e, HttpServletRequest request) {

        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandartError err = new StandartError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
