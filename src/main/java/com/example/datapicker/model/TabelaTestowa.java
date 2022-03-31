package com.example.datapicker.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tabela_testowa")
public class TabelaTestowa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "kolumna1")
    private String kolumna1;

    @Column(name = "kolumna2")
    private String kolumna2;

    @Column(name = "kolumna3")
    private String kolumna3;

    @Column(name = "kolumna4")
    private Long kolumna4;

}
