package com.example.dictionarydemo.service;

import com.example.dictionarydemo.dao.WordEntryRepository;
import com.example.dictionarydemo.domain.WordEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordEntryService {
    @Autowired
    private WordEntryRepository wordEntryRepository;


    public WordEntry findById(Integer id) {
        WordEntry wordEntry = wordEntryRepository.findById(id).get();
        return wordEntry;
    }

    public List<WordEntry> findByWordLike(String word) {
        List<WordEntry> wordEntryList = wordEntryRepository.findByWordLike("%" + word + "%");
        return wordEntryList;
    }

    public List<WordEntry> findByParaphraseLike(String paraphrase) {
        List<WordEntry> wordEntryList = wordEntryRepository.findByParaphraseLike(paraphrase);
        return wordEntryList;
    }

    StringBuffer s = new StringBuffer();

}
