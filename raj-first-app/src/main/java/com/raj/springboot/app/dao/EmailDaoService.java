package com.raj.springboot.app.dao;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Component;

@Component
public class EmailDaoService {
	
	
	public void sendmail() throws AddressException, MessagingException, IOException {
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		    	 // Genearate app password to sent an email. 
		         return new PasswordAuthentication("singhraj.swd@gmail.com", "seodfjpbcvenjmvl");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("singhraj.swd@gmail.com", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("raj.swd1@gmail.com"));
		   msg.setSubject("Raj send email test");
		   msg.setContent("<strong>Dear,</strong><br><br> <p> This is an email template test for testing using java email api.</p>", "text/html");
		   msg.setSentDate(new Date());
		   Transport.send(msg);   
		}

}
