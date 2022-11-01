package com.SportyShoes.major.service;


import java.util.List;

import com.SportyShoes.major.model.User;
import com.SportyShoes.major.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> getAllUser(){return  userRepository.findAll();}

    public void removeUserById(int id) {userRepository.deleteById(id);}

}
