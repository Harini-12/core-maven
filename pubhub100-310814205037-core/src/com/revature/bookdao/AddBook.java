package com.revature.bookdao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.revature.connection.ConnectionUtil;
import com.revature.model.Book;

public class AddBook implements com.revature.dao.AddBook{

	

	@Override
	public void addBook(Book book) throws Exception {
		// TODO Auto-generated method stub
		Connection con=(Connection) ConnectionUtil.getConnection();
		String sql="insert into books(name,price,author) values(?,?,?)";
	    PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
	    pst.setString(1, book.getName());
	    pst.setInt(2, book.getPrice());
	    pst.setString(3, book.getAuthor());
	    int rows=pst.executeUpdate();
	    System.out.println("row created");
	}
	

}
