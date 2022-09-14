package com.geekbrains.apiHomeWork;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ApiSearchRequest {
    private String item;
    private String aisle;
    private Boolean parse;
}
