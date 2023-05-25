package com.example.excersais.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "title must not be Empty..")
    @Column(columnDefinition = " varchar(20) not null")
    private String title;
    @NotEmpty(message = "Author must not be Empty..")
    @Column(columnDefinition = " varchar(20) not null")
    private String Author;
    @NotEmpty(message = "category must not be Empty..")
    @Column(columnDefinition = " varchar(20) not null check(category='Academic' or category='Mystery' or category='Novel')")
    private String category;
    @Column
    private Integer ISBN;
    @Min(500)
    @Column(columnDefinition = "min(50)")
    private Integer numberOfPages;
}
