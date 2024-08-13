package com.alphaware.continent_fetcher.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

@ControllerAdvice
public class GlobalExceptionHandler {

    /*
    * This Exception will be applicable when the given URL is not responding
    */
    @ExceptionHandler(RestClientException.class)
    public ResponseEntity<String> handelRestClientException(String msg){
        return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
    }

    /*
    * This Exception will be applicable when the data is not available in our database according to the given ID
    */
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handelNullPointerException(String msg){
        return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
    }

}
