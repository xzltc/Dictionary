package com.example.dictionarydemo.dao;

import com.example.dictionarydemo.domain.WordLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface WordLibraryRepository extends JpaRepository<WordLibrary, Integer>, JpaSpecificationExecutor<WordLibrary> {
    WordLibrary findByWordLibraryId(Integer id);
}
