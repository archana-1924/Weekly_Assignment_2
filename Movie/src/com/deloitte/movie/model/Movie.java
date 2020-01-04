/*Q. Write a Java Program for following requirements
Take input from User for ID, Name, Showdate, Showtime, Status
Create movie object and populate above details
Store the object in an ArrayList
Take input from user for ID and display the details in the movie object of that ID.
- User Interface should be in class having main method
- Storage should be in Data Access Object

- Ensure proper coding standards, naming conventions, OOP concepts*/
package com.deloitte.movie.model;

public class Movie {

	private int id;
	private String name;
	private String showDate;
	private String showTime;
	private String status;
	
	public Movie() {
		
	}
	public Movie(int id, String name, String showDate, String showTime, String status) {
		super();
		this.id = id;
		this.name = name;
		this.showDate = showDate;
		this.showTime = showTime;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Movie [id = " + id + ", name = " + name + ", showDate = " + showDate + ", showTime = " + showTime + ", status = "
				+ status + "]\n";
	}
	
	
}
