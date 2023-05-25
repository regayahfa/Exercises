package com.example.excersais.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "name must not be Empty")
    @Column(columnDefinition = "varchar(20) not null")
    private String name;
@NotEmpty(message = "username must not be Empty")
    @Column(columnDefinition = "varchar(20) not null")
    private String username;
    @Column(columnDefinition = "")
    private String pass;
    @Email
    @Column(columnDefinition = "unique")
    private String email;

}
