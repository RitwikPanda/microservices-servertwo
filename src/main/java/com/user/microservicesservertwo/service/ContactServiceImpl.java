package com.user.microservicesservertwo.service;

import com.user.microservicesservertwo.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L, "agent@gmail.com", "Agent", 007L),
            new Contact(2L, "coder@gmail.com", "Coder", 007L),
            new Contact(3L, "Luis@gmail.com", "Luis", 10L),
            new Contact(4L, "neymar@gmail.com", "Neymar", 10L),
            new Contact(5L, "xavi@gmail.com", "Xavi", 128L),
            new Contact(6L, "busi@gmail.com", "Busi", 128L)
            );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
    }
}
