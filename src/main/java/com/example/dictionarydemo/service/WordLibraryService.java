package com.example.dictionarydemo.service;

import com.example.dictionarydemo.dao.WordLibraryRepository;
import com.example.dictionarydemo.domain.WordLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WordLibraryService {
    @Autowired
    private WordLibraryRepository wordLibraryRepository;

    public WordLibrary findWordLibraryById(Integer id){
        WordLibrary wordLibrary = wordLibraryRepository.findByWordLibraryId(id);
        return wordLibrary;
    }

}
