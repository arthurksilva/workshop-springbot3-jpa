package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","Maria@g.com","99999","12345");
		return ResponseEntity.ok().body(u);
	}
}

//Link do BD H2:
//http://localhost:8080/h2-console/login.jsp?jsessionid=17fae9d0fe78a7ff3262ac42016923b6