package pl.javstart.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import pl.javstart.model.Booking;


public class BookDaoImp implements BookDao {

	private EntityManagerFactory managoFact;
	private EntityManager manago;
	
	
	
	public BookDaoImp () {
		managoFact = Persistence.createEntityManagerFactory("myPersistenceUnit");
		manago = managoFact.createEntityManager();
	}
	
	
	
	public void save(Booking book) {
		EntityTransaction tx = manago.getTransaction();
		tx.begin();
		manago.persist(book);
		tx.commit();
	}

	
	
	
	public Booking get(Long id) {
		Booking book = manago.find(Booking.class, id);
		return book;
	}

	
	
	
	public void cleanUp() {
		manago.close();
		managoFact.close();
	}

}
