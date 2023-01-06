package com.example.electronicshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electronicshop.domain.electronic;

@Repository
public interface electronicrepository extends JpaRepository<electronic, Long>{

}
