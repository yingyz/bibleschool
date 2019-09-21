package com.cpp.project.Exceptions;

import com.cpp.project.Exceptions.Exception.DuplicateAccountException;
import com.cpp.project.Exceptions.Response.DuplicateAccountResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    public final ResponseEntity<Object> handleDuplicateAccountException(DuplicateAccountException ex, WebRequest request){
        DuplicateAccountResponse response = new DuplicateAccountResponse(ex.getMessage());
        return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);

    }

}
