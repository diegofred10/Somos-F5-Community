package com.somosf5community.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.somosf5community.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
