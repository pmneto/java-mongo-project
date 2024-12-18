package com.paulo.services;


import com.paulo.domain.User;
import com.paulo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository repo;

    public List<User> findAll(){

        return repo.findAll();

    }
}
