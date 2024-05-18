package com.example.Frases.Aleatorias.controller;

import com.example.Frases.Aleatorias.dto.FraseDTO;
import com.example.Frases.Aleatorias.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    FraseDTO obterFrase(){
        return service.obterFrase();
    }

}
