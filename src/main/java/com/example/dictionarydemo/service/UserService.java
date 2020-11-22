package com.example.dictionarydemo.service;

import com.example.dictionarydemo.dao.UserRepository;
import com.example.dictionarydemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<User> findByUserId(Integer id){
        return userRepository.findByUserId(id);

    }

    public List<User> findByNickname(String name) {
        return userRepository.findByNicknameLike(name + '%');
    }

    public void save() {
    }

}
