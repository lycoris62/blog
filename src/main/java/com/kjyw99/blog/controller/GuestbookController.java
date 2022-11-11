package com.kjyw99.blog.controller;

import com.kjyw99.blog.dto.GuestbookDTO;
import com.kjyw99.blog.service.GuestbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestbookController {

    private GuestbookService guestbookService;

    public GuestbookController(GuestbookService guestbookService) {
        this.guestbookService = guestbookService;
    }

    @GetMapping("/api/v1/guestbook")
    public List<GuestbookDTO> getGuestbook() {
        return guestbookService.findAll();
    }
}
