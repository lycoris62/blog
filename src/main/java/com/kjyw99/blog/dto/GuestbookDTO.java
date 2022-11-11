package com.kjyw99.blog.dto;

import java.util.Date;

public class GuestbookDTO {
    private Long id;
    private String nickname;
    private String password;
    private String content;
    private Date createdAt;

    public GuestbookDTO(Long id, String nickname, String password, String content, Date createdAt) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.content = content;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
