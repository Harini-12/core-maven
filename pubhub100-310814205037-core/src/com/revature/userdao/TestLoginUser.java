package com.revature.userdao;

import com.revature.model.User;

public class TestLoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.setEmail("harini@gmail.com");
		user.setPassword("pass");
		LoginUser ud=new LoginUser();
		try 
		{
			System.out.println(ud.login(user));
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
