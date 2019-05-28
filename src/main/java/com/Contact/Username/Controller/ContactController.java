package com.Contact.Username.Controller;

import com.Contact.Username.Domain.Contact;
import com.Contact.Username.Repository.GeneralRepository;
import com.Contact.Username.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
	public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
		public ResponseEntity<Iterable<Contact>> AllContact () {
		Iterable<Contact> AllContact = contactService.getAllContact();
		return new ResponseEntity<>(AllContact, HttpStatus.OK);
		}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ResponseEntity<?> saveContact( @RequestBody Contact contact){
		contactService.addContact(contact);
		return new ResponseEntity<>(HttpStatus.CREATED );
	}

	@RequestMapping(value = "/contact/{id}", method = RequestMethod.PUT)
		public ResponseEntity<?> updateContact(@RequestBody Contact contact){
		contactService.UpdateContact(contact);
		return new ResponseEntity<>(HttpStatus.OK);
		}

	@RequestMapping(value = "/contact/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<?> deleteContact(@PathVariable Long id){
		contactService.deleteContact(id);
		return new ResponseEntity<>(HttpStatus.OK);
		}

	@RequestMapping(value = "/contact/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> getOneContact(@PathVariable Long contactId){
			contactService.getOneContact(contactId);
		return new ResponseEntity<>(HttpStatus.OK);
		}

	@RequestMapping(value = "/contact/allcontact", method = RequestMethod.POST)
	public ResponseEntity<Iterable<Contact>> ArrayContact(@RequestBody Iterable<Contact> contacts){
		contactService.SaveAllContact(contacts);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	}

