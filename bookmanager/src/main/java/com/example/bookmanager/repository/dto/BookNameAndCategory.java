package com.example.bookmanager.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookNameAndCategory {
    private String name;
    private String category;
//    String getName();
//    String getCategory();
}
