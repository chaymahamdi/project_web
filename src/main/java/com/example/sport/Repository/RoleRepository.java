package com.example.sport.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sport.Model.ERole;
import com.example.sport.Model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
    Role findByName(String name);
}
