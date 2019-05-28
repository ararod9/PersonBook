package com.Contact.Username.Service;

import com.Contact.Username.Controller.ContactController;
import com.Contact.Username.Domain.Contact;
import com.Contact.Username.Repository.GeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

	@Autowired
	private GeneralRepository generalRepository;

	public void addContact ( Contact contact){
		generalRepository.save(contact);
	}

	public void deleteContact(Long id){
		generalRepository.deleteById(id);
	}

	public Iterable<Contact> getAllContact(){
		return generalRepository.findAll();
	}

	public Optional<Contact> getOneContact(Long id){
		return generalRepository.findById(id);
	}

	public void UpdateContact(Contact contact){
		generalRepository.save(contact);
	}
	public void SaveAllContact(Iterable<Contact> contacts){
		generalRepository.saveAll(contacts);
	}


}
