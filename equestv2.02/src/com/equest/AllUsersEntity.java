package com.equest;

public class AllUsersEntity {

	private String user_fname;
	private String user_lname;
	private int user_id;
	private String email_id;
	private String password;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_lname() {
		return user_lname;
	}

	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}

	public String getUser_fname() {
		return user_fname;
	}

	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}

	public AllUsersEntity(String user_fname, String user_lname, int user_id,
			String email_id) {
		super();
		this.user_fname = user_fname;
		this.user_lname = user_lname;
		this.user_id = user_id;
		this.email_id = email_id;
	}

	public AllUsersEntity() {
		super();

	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}//
