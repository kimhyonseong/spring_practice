package com.example.bookmanager.repository;

import com.example.bookmanager.domain.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReviewInfo, Long> {
}
