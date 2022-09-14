package com.geekbrains.apiHomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiGetResult {
    private List<ApiResult> aisles;
    private Float cost;
    private Long startDate;
    private Long endDate;
}
