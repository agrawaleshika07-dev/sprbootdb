package com.example.eshprojgit;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

public interface MessageRepository extends JpaRepository<Message, Long> {
}

