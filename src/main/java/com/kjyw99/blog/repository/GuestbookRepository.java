package com.kjyw99.blog.repository;

import com.kjyw99.blog.dto.GuestbookDTO;

import java.util.List;

public interface GuestbookRepository {

    public List<GuestbookDTO> findAll();
}
