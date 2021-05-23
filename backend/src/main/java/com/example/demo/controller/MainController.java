package com.example.demo.controller;

import com.example.demo.domain.Sample;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/sample")
public class MainController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Sample> getSample(){
        Sample sample = new Sample();
        sample.setName("asdf");
        sample.setEmail("asdfasdf");
        log.info("sample");
        return new ResponseEntity<>(sample, HttpStatus.OK);
    }
}
