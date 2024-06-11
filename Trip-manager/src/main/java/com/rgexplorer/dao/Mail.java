package com.rgexplorer.dao;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.rgexplorer.model.TripManagerPojo;

public class Mail {
    Session newSession = null;

    public void sendEmail(MimeMessage message) throws MessagingException {
        String fromUser = "rgexplorer24@gmail.com";
        String fromUserPassword = "hydm jnoe vdzt pbua";
        String emailHost = "smtp.gmail.com";
        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserPassword);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    public MimeMessage draftEmail(String email, String otp) throws MessagingException {
        newSession = setupServerProperties();
        MimeMessage message = new MimeMessage(newSession);

        String emailSubject = "Registration OTP!";
        String emailBody = otp + " is your OTP for RGexplorer registration. Please don't share your OTP.";

        
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));


        message.setSubject(emailSubject);

        
        MimeBodyPart bodyPart = new MimeBodyPart();
        bodyPart.setContent(emailBody, "text/plain");

        
        MimeMultipart multiPart = new MimeMultipart();
        multiPart.addBodyPart(bodyPart);

        
        message.setContent(multiPart);

        return message;
    }

    public Session setupServerProperties() {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        return Session.getDefaultInstance(properties, null);
    }
    
    
}
