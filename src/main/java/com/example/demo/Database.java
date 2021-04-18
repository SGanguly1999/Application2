package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
public class Database {
	
	public static void entry(Musician musician,Album album,Song song,Instruments instruments,Address address) {
		
		// Setting the relation
		Produces produces=new Produces(musician.getSSN(),album.getIdentifier());
		Contains contains=new Contains(album.getIdentifier(),song.getSong_id());
		Sings sings=new Sings(musician.getSSN(),song.getSong_id());
		Plays plays=new Plays(musician.getSSN(),instruments.getInstrumentid());
		Lives lives=new Lives(musician.getSSN(),address.getPhone());
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(musician);
		session.saveOrUpdate(album);
		session.saveOrUpdate(song);
		session.saveOrUpdate(instruments);
		session.saveOrUpdate(address);
		session.save(produces);
		session.save(contains);
		session.save(sings);
		session.save(plays);
		session.save(lives);
		tx.commit();
		session.close();
	}

	

}
