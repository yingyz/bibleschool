package com.cpp.project.Exceptions.Response;

public class DuplicateAccountResponse {
    private String username;
    public DuplicateAccountResponse(String username){this.username = username;}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
