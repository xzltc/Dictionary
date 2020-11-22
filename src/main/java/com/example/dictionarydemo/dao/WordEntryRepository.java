package com.example.dictionarydemo.dao;

import com.example.dictionarydemo.domain.WordEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface WordEntryRepository extends JpaRepository<WordEntry,Integer>, JpaSpecificationExecutor<WordEntry> {
    List<WordEntry> findAll();

    List<WordEntry> findByWordLike(String word);

    List<WordEntry> findByParaphraseLike(String paraphrase);

}
