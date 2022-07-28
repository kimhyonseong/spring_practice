package com.example.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UserTest {
    @Test
    void test() {
        Member user = new Member();
        user.setEmail("khs1@one.com");
        user.setName("khs");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        Member user1 = new Member(null,"khs","khs@one.com",LocalDateTime.now(),LocalDateTime.now());
        System.out.println(user1);
    }
}