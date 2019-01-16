package org.main.login;

import java.util.HashMap;

public class Login {

	private String username;
	private String password;
	HashMap<String, String> userList = new HashMap<>();
	
	public Login(String username,String password) {
		this.username = username;
		this.password = password;
		userList.put("Ravi", "teja");
		userList.put("Devraj", "M");
		userList.put("Poornima", "B");
		userList.put("kishore", "kumar");
		userList.put("tarun", "tarun");
		userList.put("shivu", "kumar");
		userList.put("shashank", "bindu");
		userList.put("purshi", "s");
		userList.put("aman", "singh");
	}
	
	public boolean authenticate() {
		if(userList.get(this.username)==this.password) {
			return true;
		}else {
			return false;
		}
	}
	
}
