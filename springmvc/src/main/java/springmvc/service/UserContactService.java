package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.ObjectHandler.ContactObject;
import springmvc.dao.ContactDao;

@Service
public class UserContactService {
	
	@Autowired
	private ContactDao contactDao;
	
	public int createUser(ContactObject user) {
		return this.contactDao.saveContact(user);
	}

}
