package com.example.FileOperation.service;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.FileOperation.model.User;
import com.example.FileOperation.repository.UserRepository;
import com.example.FileOperation.utilities.FileOperationService;

@Service
public class UserService {


	@Autowired
	UserRepository userRepo;
	
	@Autowired
	FileOperationService fileService;
	
	public ResponseEntity<Resource> generateUsersFile(){
		try {
			Iterable<User> users = userRepo.findAll();
			String fileName= "users.csv";
			InputStreamResource file = new InputStreamResource(fileService.generateFile(users, null));
			return ResponseEntity.ok()
			        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName)
			        .contentType(MediaType.parseMediaType("application/csv"))
			        .body(file);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
