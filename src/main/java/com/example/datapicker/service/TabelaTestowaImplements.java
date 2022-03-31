package com.example.datapicker.service;

import com.example.datapicker.Interfaces.TabelaTestowaRepository;
import com.example.datapicker.model.TabelaTestowa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TabelaTestowaImplements implements TabeltaTestowaServices{
    @Autowired
    private TabelaTestowaRepository repository;
    @Override
    public Iterable<TabelaTestowa> listallnotuniquevalues() {
        return repository.Notunique();
    }

    @Override
    public Iterable<TabelaTestowa> listallunique() {
        return repository.Unique();
    }
}
