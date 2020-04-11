package com.letunnel.model;

import lombok.Data;

@Data
public class User extends Person {

    private String username;
    private String password;

}
