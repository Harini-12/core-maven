package com.revature.bookdao;


import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.revature.connection.ConnectionUtil;
import com.revature.model.Book;

public class UpdateBookPrice {
	
	public void updatebookprice(Book book) throws Exception
	{
		Connection con=(Connection) ConnectionUtil.getConnection();
		String sql="update books set price=300 where name=?";
	    PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
	    pst.setString(1, book.getName());
	    int rows=pst.executeUpdate();
	    System.out.println("price updated");
	}

}
