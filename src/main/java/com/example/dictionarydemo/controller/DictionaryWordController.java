package com.example.dictionarydemo.controller;

import com.example.dictionarydemo.domain.*;
import com.example.dictionarydemo.service.UserService;
import com.example.dictionarydemo.service.WordEntryService;
import com.example.dictionarydemo.service.WordLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dictionary/word")
public class DictionaryWordController {
    @Autowired
    private WordEntryService wordEntryService;
    @Autowired
    private WordLibraryService wordLibraryService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/suggestion", method = RequestMethod.GET)
    public BaseResponse getWord(@RequestParam("word") String word) {
        List wordList = wordEntryService.findByWordLike(word);
        if(wordList.size()==0){
            return new BaseResponse<String>(false, "未匹配", "false");
        }
        WordEntry wordEntry = (WordEntry) wordList.get(0);
        Word word1 = new Word();
        word1.setWord(wordEntry.getWord());
        word1.setParaphrase(wordEntry.getParaphrase());
        word1.setPartOfSpeeh(wordEntry.getPartOfSpeeh());
        return new BaseResponse<Word>(true, "查询成功", word1);
    }

}
