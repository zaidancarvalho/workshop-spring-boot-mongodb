package com.educandoweb.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
