package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringSendMailAttachmentApplication {
	
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringSendMailAttachmentApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMain() throws MessagingException {

		emailSenderService.sendMailWithAttachment("tuannaph11253@fpt.edu.vn",
				"This is email body",
				"This is email subject","C:\\Users\\asus\\Downloads\\WebDeveloper-ITviec.docx");

	}


}
