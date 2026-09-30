package com.shopping.mall.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.mall.entity.User;
import com.shopping.mall.repository.UserRepository;
import com.shopping.mall.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUser(int id) {
        return repo.findById(id).get();
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repo.deleteById(id);
    }
}