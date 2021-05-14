package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepository extends JpaRepository<Language, Long> {
}
