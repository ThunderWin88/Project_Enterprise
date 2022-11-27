package com.example.restservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restservice.Models.User;

public interface UserRepo extends JpaRepository<User,Long>{
    
}
