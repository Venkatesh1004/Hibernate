
package com.easylearnjava.dto;

public class UserDtoDemo {

	private int uid;
	private String uname;
	private String password;

	@Override
	public String toString() {
		return "UserDtoDemo [uid=" + uid + ", uname=" + uname + ", password=" + password + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}