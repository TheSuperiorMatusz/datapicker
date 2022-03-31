package com.example.datapicker.controller;

import com.example.datapicker.model.TabelaTestowa;
import com.example.datapicker.service.TabeltaTestowaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class TabelatestController {
    @Autowired
    private TabeltaTestowaServices tabelaservices;

    @GetMapping(value = "/tabela/unique",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TabelaTestowa> redirect(Model model){
        return tabelaservices.listallunique();
    }
    @GetMapping(value = "/table/notunique",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<TabelaTestowa> getnotunique(Model model){
        return tabelaservices.listallnotuniquevalues();
    }
}
