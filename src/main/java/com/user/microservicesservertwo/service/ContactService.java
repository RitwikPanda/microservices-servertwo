package com.user.microservicesservertwo.service;

import com.user.microservicesservertwo.entity.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}
