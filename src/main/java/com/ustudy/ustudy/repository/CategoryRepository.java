package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
