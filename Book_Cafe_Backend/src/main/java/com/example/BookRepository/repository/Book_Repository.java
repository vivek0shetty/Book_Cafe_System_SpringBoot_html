package com.example.BookRepository.repository;

import com.example.BookRepository.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Book_Repository extends JpaRepository<Book,Long> {
}
