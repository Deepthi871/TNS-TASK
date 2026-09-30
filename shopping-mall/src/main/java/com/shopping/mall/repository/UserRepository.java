package com.shopping.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.mall.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}