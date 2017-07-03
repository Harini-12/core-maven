package com.revature.userdao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.revature.connection.ConnectionUtil;
import com.revature.model.User;

public class LoginUser implements com.revature.dao.LoginUser {

	@Override
	public boolean login(User user) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con=(Connection) ConnectionUtil.getConnection();
		String sql="select name from users1 where email=? and password=?";
	    PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
	    pst.setString(1, "xyz@gmsil.com");
	    pst.setString(2, "passwrd");
	    boolean flag=false;
	    ResultSet rs=(ResultSet) pst.executeQuery();
	    if(rs.next())
	    {
	    	flag=true;
	    	
	    }
	    
		return flag;
	}

}
