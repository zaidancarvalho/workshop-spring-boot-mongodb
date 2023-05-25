package com.educandoweb.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.educandoweb.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
