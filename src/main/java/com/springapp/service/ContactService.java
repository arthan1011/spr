package com.springapp.service;

import com.springapp.domain.Contact;

import java.util.List;

/**
 * Created by artur.shamsiev on 20.02.2015
 */
public interface ContactService {
    List<Contact> findAll();

    Contact findById(Long id);

    Contact save(Contact contact);
}
