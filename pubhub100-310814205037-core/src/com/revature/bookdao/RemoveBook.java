package com.revature.bookdao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.revature.connection.ConnectionUtil;
import com.revature.model.Book;

public class RemoveBook{
	
	public void removebook(Book book) throws Exception
	{
		Connection con=ConnectionUtil.getConnection();
		String sql="delete from books where name=?";
	    PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
	    pst.setString(1, book.getName());
	    int rows=pst.executeUpdate();
	    System.out.println("row deleted");
	}
	
}
