package com.letunnel.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends Person {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Builder
    public User(String firstName, String lastName, String address, String city, String telephone, String mail, String username, String password) {
        super(firstName, lastName, address, city, telephone, mail);
        this.username = username;
        this.password = password;
    }
}
