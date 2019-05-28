package com.Contact.Username.Repository;

import com.Contact.Username.Domain.Company;
import com.Contact.Username.Domain.Contact;
import org.springframework.data.repository.CrudRepository;

public interface GeneralRepository extends CrudRepository<Contact, Long>{

}
