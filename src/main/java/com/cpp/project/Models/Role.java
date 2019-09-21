package com.cpp.project.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
public class Role {

   // @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
/*
    @Column(unique = true)
    private String rolename;

    @OneToMany(mappedBy ="role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<User> users = new HashSet<>();
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
