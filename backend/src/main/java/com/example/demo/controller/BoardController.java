package com.example.demo.controller;


import com.example.demo.domain.Board;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/board")
public class BoardController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Board> postBoard(@RequestBody Board board){
        log.info("request = " + board.getTitle());
        return new ResponseEntity<>(board, HttpStatus.OK);
    }
}
