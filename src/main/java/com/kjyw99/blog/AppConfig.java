package com.kjyw99.blog;

import com.kjyw99.blog.repository.GuestbookRepository;
import com.kjyw99.blog.repository.GuestbookRepositoryImpl;
import com.kjyw99.blog.service.GuestbookService;
import com.kjyw99.blog.service.GuestbookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GuestbookRepository guestbookRepository() {
        return new GuestbookRepositoryImpl();
    }

    @Bean
    public GuestbookService guestbookService() {
        return new GuestbookServiceImpl(guestbookRepository());
    }
}
