package com.kjyw99.blog.repository;

import com.kjyw99.blog.dto.GuestbookDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class GuestbookRepositoryImpl implements GuestbookRepository{

    static GuestbookDTO g1;
    static GuestbookDTO g2;

    static {
        try {
            g1 = new GuestbookDTO(1L, "lycoris62", "1234", "안녕하세요", new SimpleDateFormat("yyyyMMdd").parse("20221106"));
            g2 = new GuestbookDTO(2L, "99mTc", "5678", "반갑습니다", new SimpleDateFormat("yyyyMMdd").parse("20221107"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<GuestbookDTO> guestbookList = List.of(new GuestbookDTO[]{g1, g2});

    @Override
    public List<GuestbookDTO> findAll() {
        return guestbookList;
    }
}
