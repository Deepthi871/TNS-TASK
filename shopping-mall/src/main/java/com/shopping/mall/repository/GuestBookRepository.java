package com.shopping.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.mall.entity.GuestBook;

@Repository
public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {
}