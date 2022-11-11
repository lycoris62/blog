package com.kjyw99.blog.service;

import com.kjyw99.blog.dto.GuestbookDTO;
import com.kjyw99.blog.repository.GuestbookRepository;

import java.util.List;

public class GuestbookServiceImpl implements GuestbookService{

    private GuestbookRepository guestbookRepository;

    public GuestbookServiceImpl(GuestbookRepository guestbookRepository) {
        this.guestbookRepository = guestbookRepository;
    }

    @Override
    public List<GuestbookDTO> findAll() {
        return guestbookRepository.findAll();
    }
}
