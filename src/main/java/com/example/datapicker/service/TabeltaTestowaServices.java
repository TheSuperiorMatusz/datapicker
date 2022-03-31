package com.example.datapicker.service;

import com.example.datapicker.model.TabelaTestowa;
import org.springframework.stereotype.Service;


public interface TabeltaTestowaServices {
    Iterable<TabelaTestowa> listallnotuniquevalues();
    Iterable<TabelaTestowa> listallunique();
}
