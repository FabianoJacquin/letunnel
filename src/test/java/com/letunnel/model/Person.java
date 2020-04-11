package com.letunnel.model;


import lombok.Data;

@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String telephone;
    private String mail;

}
