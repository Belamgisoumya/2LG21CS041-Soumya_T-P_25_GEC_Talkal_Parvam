package com.example.spotfinder.Service;

import com.example.spotfinder.Model.ContactMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageService repository;

    public ContactMessage saveMessage(ContactMessage contactMessage) {
        return repository.save(contactMessage);
    }

    private ContactMessage save(ContactMessage contactMessage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
