package com.kjyw99.blog.service;

import com.kjyw99.blog.dto.GuestbookDTO;

import java.util.List;

public interface GuestbookService {
    public List<GuestbookDTO> findAll();
}
