package ×¢²áÓëµÇÂ¼;

import Åä¼þ.Student;

public class User {
	private String UserName;
	private String password;
	public User() {}
	public User(String userName, String password) {
		super();
		UserName = userName;
		this.password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean equals(Object o) {
        return (this.getUserName() == ((User) o).getUserName() && this.getPassword() == ((User) o).getPassword());
    }
}
