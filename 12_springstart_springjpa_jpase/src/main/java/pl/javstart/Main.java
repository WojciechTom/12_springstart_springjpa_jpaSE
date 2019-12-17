package pl.javstart;

import pl.javstart.dao.BookDao;
import pl.javstart.dao.BookDaoImp;
import pl.javstart.model.Booking;

public class Main {

	public static void main (String[] args) {
		
		//Booking book1 = new Booking("1234", "Blue Lattitudes", "Tony Horwitz");
		//Booking book2 = new Booking("1235", "Wiedzmin", "Andrzej Sapkowski");
		//Booking book3 = new Booking("1236", "Filary Ziemi", "Ken Follet");
	
		BookDao bdm = new BookDaoImp();
		//bdm.save(book1);
		//bdm.save(book2);
		//bdm.save(book3);

		Booking bok = bdm.get(1L);
		System.out.println("ksi¹¿ka pobrana: " + bok.toString());
				
		bdm.cleanUp();
		
		
		
	}
}
