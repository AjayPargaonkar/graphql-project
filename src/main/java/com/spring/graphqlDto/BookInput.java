package com.spring.graphqlDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookInput {
    private String title;
    private String description;
    private String author;
    private Double price;
    private Integer pages;
}
