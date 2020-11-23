package com.example.FileOperation.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService{
	
	 @Autowired
	 private JavaMailSender emailSender;

	public void sendMail(String subject, String body, String attchmentPath, String to, String fileName, String[] cc) throws AddressException, MessagingException {
		
		MimeMessage message = emailSender.createMimeMessage();
	     
	    MimeMessageHelper helper = new MimeMessageHelper(message, true);
	    
	    helper.setTo(to);
	    helper.setSubject(subject);
	    helper.setText(body);
	        
	    FileSystemResource file 
	      = new FileSystemResource(new File(attchmentPath));
	    helper.addAttachment(fileName, file);
	 
	    emailSender.send(message);
		
	}
	
}
