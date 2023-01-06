package com.example.electronicshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronicshop.domain.electronic;
import com.example.electronicshop.repository.electronicrepository;

@Service
public class electronicservice {
	
	@Autowired
    private electronicrepository repo;
	
	public List<electronic> listAll() {
        return repo.findAll();
    }
     
    public void save(electronic std) {
        repo.save(std);
    }
     
    public electronic get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }

}
