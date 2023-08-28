package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"James","james@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Rocky","rocky@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Thanos","thanos@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Harry","harry@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
