package com.shopping.mall.service;

import java.util.List;
import com.shopping.mall.entity.GuestBook;

public interface GuestBookService {
    GuestBook addFeedback(GuestBook guestBook);
    List<GuestBook> getAllFeedbacks();
    GuestBook getFeedbackById(int id);
    void deleteFeedback(int id);
}