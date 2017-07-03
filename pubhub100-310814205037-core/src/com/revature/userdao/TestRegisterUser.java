package com.revature.userdao;

import com.revature.model.User;

public class TestRegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("aaa");
		user.setEmail("aaa@gmail.com");
		user.setPassword("pass45");
		RegisterUser ud=new RegisterUser();
		try 
		{
			ud.register(user);
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
