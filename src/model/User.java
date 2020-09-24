package model;


import java.time.LocalDateTime;


public class User{
	private String Email;
	private String Password;
	
	LocalDateTime Date;
    
	public User(String email, String password, LocalDateTime Date) {
		Email = email;
		Password = password;
		this.Date = Date;
		
	}
	
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public LocalDateTime getDate() {
		return Date;
	}

	public void setDate(LocalDateTime Date) {
		this.Date = Date;
	}

	
	
	
	
	
}