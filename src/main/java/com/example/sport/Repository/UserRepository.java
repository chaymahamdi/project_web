package com.example.sport.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.sport.Model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
