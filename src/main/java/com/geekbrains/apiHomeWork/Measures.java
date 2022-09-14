package com.geekbrains.apiHomeWork;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Measures {
    private Original original;
    private Original metric;
    private Original us;

}
