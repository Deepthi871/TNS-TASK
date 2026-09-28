package com.shopping.mall.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.shopping.mall.entity.GuestBook;
import com.shopping.mall.service.GuestBookService;

@RestController
@RequestMapping("/guestbook")
public class GuestBookController {

    @Autowired
    private GuestBookService service;

    @PostMapping("/add")
    public GuestBook add(@RequestBody GuestBook gb) {
        return service.addFeedback(gb);
    }

    @GetMapping("/all")
    public List<GuestBook> getAll() {
        return service.getAllFeedbacks();
    }

    @GetMapping("/{id}")
    public GuestBook getById(@PathVariable int id) {
        return service.getFeedbackById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteFeedback(id);
        return "Deleted Successfully";
    }
}