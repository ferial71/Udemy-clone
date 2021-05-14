package com.ustudy.ustudy.repository;

import com.ustudy.ustudy.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
