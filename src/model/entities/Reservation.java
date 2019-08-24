package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;



public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//Minha classe DomainException herdando da classe Exception
	//public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
	
	//Minha classe DomainException herdando da classe RuntimeException
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
	
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	//Minha classe DomainException herdando da classe Exception
	//public String updateDates(Date checkIn, Date checkOut) throws DomainException {
	
	//Minha classe DomainException herdando da classe RuntimeException
	public String updateDates(Date checkIn, Date checkOut){
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			
			//Lançando uma string
			//return "Reservation dates for update must be future dates";
			
			//Lançando uma exceção
			//throw new IllegalArgumentException("Reservation dates for update must be future dates");
			
			throw new DomainException("Reservation dates for update must be future dates");
			
		}
		if (!checkOut.after(checkIn)) {
			
			//return "Check-out date must be after check-in date";
			
			//throw new IllegalArgumentException("Check-out date must be after check-in date");
			
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}
