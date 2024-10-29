package com.example.StudentDb.repo;

import com.example.StudentDb.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Integer> {
}
