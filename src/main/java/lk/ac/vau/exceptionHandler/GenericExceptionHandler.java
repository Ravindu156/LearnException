package lk.ac.vau.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.model.ErrorResponse;

@RestControllerAdvice
public class GenericExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEntityNotFound(EntityNotFoundException exception){
        ErrorResponse errorResponse =new ErrorResponse(HttpStatus.NOT_FOUND.value(),exception.getMessage().toString());
    }
}
