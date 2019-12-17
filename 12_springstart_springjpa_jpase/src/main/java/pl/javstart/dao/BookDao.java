package pl.javstart.dao;

import pl.javstart.model.Booking;

public interface BookDao {

	public void save(Booking book);
	public Booking get(Long Id);
	public void cleanUp();
}


