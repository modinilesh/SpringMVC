package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.ObjectHandler.ContactObject;

@Repository
public class ContactDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public int saveContact(ContactObject user) {
		System.out.println(user);
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
		
	}
	

}
