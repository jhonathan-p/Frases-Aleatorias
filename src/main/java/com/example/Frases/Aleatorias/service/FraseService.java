package com.example.Frases.Aleatorias.service;

import com.example.Frases.Aleatorias.dto.FraseDTO;
import com.example.Frases.Aleatorias.model.Frase;
import com.example.Frases.Aleatorias.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

//    public String teste() {
//        return "mas que desgraça";
//    }

//    public List<FraseDTO> obterFrase() {
//        return repository.fraseAleatoria().stream()
//                .map(s -> new FraseDTO(s.getTitulo(), s.getFrase(), s.getPersonagem(), s.getPoster()))
//                .collect(Collectors.toList());
//    }

    public FraseDTO obterFrase(){
        Frase frase = repository.fraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }


}