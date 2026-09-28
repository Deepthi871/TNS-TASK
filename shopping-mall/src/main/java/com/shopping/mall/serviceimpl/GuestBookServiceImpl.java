package com.shopping.mall.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.mall.entity.GuestBook;
import com.shopping.mall.repository.GuestBookRepository;
import com.shopping.mall.service.GuestBookService;

@Service
public class GuestBookServiceImpl implements GuestBookService {

    @Autowired
    private GuestBookRepository repo;

    @Override
    public GuestBook addFeedback(GuestBook guestBook) {
        return repo.save(guestBook);
    }

    @Override
    public List<GuestBook> getAllFeedbacks() {
        return repo.findAll();
    }

    @Override
    public GuestBook getFeedbackById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteFeedback(int id) {
        repo.deleteById(id);
    }
}