package com.cpp.project.Controllers;

import com.cpp.project.Models.User;
import com.cpp.project.Requests.UserSignUpRequest;
import com.cpp.project.Services.MapValidationErrorService;
import com.cpp.project.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;


    @PostMapping("/signUp")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserSignUpRequest userSignUpRequest, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null)
        {
            return errorMap;
        }

       User user = userService.createUser(userSignUpRequest);

        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }
}
