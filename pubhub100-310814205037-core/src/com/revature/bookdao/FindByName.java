package com.revature.bookdao;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.revature.connection.ConnectionUtil;
import com.revature.model.Book;

public class FindByName {

	public List<Book> findbyname(Book book) throws Exception
	{
		Connection con=(Connection) ConnectionUtil.getConnection();
		String sql="select id,name,price,author from books where name=?";
		PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
		pst.setString(1, book.getName());
		ResultSet rs=(ResultSet) pst.executeQuery();
		List<Book> books=new ArrayList<>();
		while(rs.next())
		{
			Book b=new Book();
			b.setId(rs.getInt(1));
			b.setName(rs.getString(2));
			b.setPrice(rs.getInt(3));
			b.setAuthor(rs.getString(4));
			books.add(b);
		}
		return books;
		
	}
}
