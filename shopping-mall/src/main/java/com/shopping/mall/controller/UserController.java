package com.shopping.mall.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.shopping.mall.entity.User;
import com.shopping.mall.repository.UserRepository;
import com.shopping.mall.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;
    
    @Autowired
    UserRepository repo;

    @PostMapping("/add")
    public User add(@RequestBody User u){ 
        return service.addUser(u); 
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id){ 
        return service.getUser(id); 
    }
    
    @PutMapping("/update")
    public User update(@RequestBody User u){
        return service.updateUser(u);
    }
    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        service.deleteUser(id);
        return "Deleted id: " + id;
    }
    
    @GetMapping("/all")
    public List<User> getAll(){
        return repo.findAll();
    }
}