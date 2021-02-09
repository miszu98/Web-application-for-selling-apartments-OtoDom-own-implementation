package com.portal.otodom.Services;

import com.portal.otodom.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(User user) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(user.getEmail());
        msg.setSubject("OtoDom - dołączyłeś do nas!");
        msg.setText("Login: " + user.getUsername() + "\n" + "Password: " + user.getPassword());
        javaMailSender.send(msg);
    }
}
