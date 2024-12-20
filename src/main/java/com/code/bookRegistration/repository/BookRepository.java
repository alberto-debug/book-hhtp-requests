package com.code.bookRegistration.repository;

import com.code.bookRegistration.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
