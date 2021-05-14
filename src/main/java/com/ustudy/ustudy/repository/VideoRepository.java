package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
