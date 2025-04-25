package com.example.eazyschool.service;

import com.example.eazyschool.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        System.out.println(contact);
        log.info(contact.toString());
        return isSaved;
    }
}
