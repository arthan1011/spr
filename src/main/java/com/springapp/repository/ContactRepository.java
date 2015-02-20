package com.springapp.repository;

import com.springapp.domain.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by artur.shamsiev on 20.02.2015
 */
public interface ContactRepository extends CrudRepository<Contact, Long>{
}
