package com.example.demo.duan111.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {
    private String mssv;
    private String name;
    private double math;
    private double literature;
    private double english;
}

