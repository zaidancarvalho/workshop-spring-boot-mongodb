package com.educandoweb.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = new ArrayList<>();
		User lais = new User(null, "Lais", "lais@gmail.com");
		User felipe = new User(null, "Felipe", "felipe@gmail.com");
		list.addAll(Arrays.asList(lais, felipe));
		return ResponseEntity.ok().body(list);
	}
}
