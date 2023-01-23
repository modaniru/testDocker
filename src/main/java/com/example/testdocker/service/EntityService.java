package com.example.testdocker.service;

import com.example.testdocker.model.Entity;
import com.example.testdocker.repo.EntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {
    @Autowired
    private EntityRepo entityRepo;

    public List<Entity> getAll(){
        return entityRepo.findAll();
    }

    public Entity getById(Integer id){
        return entityRepo.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public void save(Entity entity){
        entityRepo.save(entity);
    }
}
