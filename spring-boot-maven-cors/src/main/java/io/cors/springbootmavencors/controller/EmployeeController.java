package io.cors.springbootmavencors.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping
	public ResponseEntity<?> sayHello() {
		return ResponseEntity.ok("Hello from application");
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(new ArrayList<>());
	}
	
}
