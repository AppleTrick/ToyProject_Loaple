package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;

@Log
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Board {
    private String title;
    private String content;
    private String writer;
}
