package com.example.FileOperation.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	
	@Value("${file.directory}")
	private String fileDirectory;
	
	@Value("${file.name}")
	private String fileName;
	
	@Value("${file.ex}")
	private String fileExtension;
	
	@Value("${file.compress.ex}")
	private String fileCompressExtension;
	
	@Autowired
	private MailService mailService;
	
	public ResponseEntity<Object> generateUsersFile(){
		try {
			String fullPath = this.fileDirectory ;
			String originalFile=this.fileName + this.fileExtension;
			String zipFile=this.fileName + this.fileCompressExtension;

			Iterable<User> users = userRepo.findAll();
			
			//generate file
			FileOperationService.generateFile(users, null, fullPath+originalFile);
			
			// compress
			FileOperationService.generateCompressedFile(fullPath,originalFile,zipFile);
			
			// send mail
			mailService.sendMail("subject", "body!", fullPath+zipFile, "mohamed.abdelfadeel48@gmail.com",this.fileName,null);
			
			// delete file
			FileOperationService.deleteFile(fullPath+zipFile);
			return new ResponseEntity(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
