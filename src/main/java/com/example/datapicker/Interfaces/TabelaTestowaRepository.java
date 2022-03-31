package com.example.datapicker.Interfaces;


import com.example.datapicker.model.TabelaTestowa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TabelaTestowaRepository extends CrudRepository<TabelaTestowa, String>, PagingAndSortingRepository<TabelaTestowa,String>{
    @Query(value="SELECT  a.* FROM tabela_testowa a JOIN ( SELECT kolumna1 from tabela_testowa group by kolumna1 having count(*)>1) b ON a.kolumna1=b.kolumna1",nativeQuery = true)
    Iterable<TabelaTestowa> Notunique();
    @Query(value = "SELECT  a.* FROM tabela_testowa a JOIN( SELECT kolumna1 from tabela_testowa group by kolumna1 having count(*)=1) b ON a.kolumna1=b.kolumna1",nativeQuery = true)
    Iterable <TabelaTestowa> Unique();
}