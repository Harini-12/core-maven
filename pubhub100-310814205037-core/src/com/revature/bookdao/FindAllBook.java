package com.revature.bookdao;

import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.revature.connection.ConnectionUtil;
import com.revature.model.Book;

public class FindAllBook {
	public List<Book> findall() throws Exception
	{

		Connection con=(Connection) ConnectionUtil.getConnection();
		String sql="select id,name,price,author from books";
		PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
		ResultSet rs=(ResultSet) pst.executeQuery();
		List<Book> books=new ArrayList<>();
		while(rs.next())
		{
			Book book=new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setPrice(rs.getInt(3));
			book.setAuthor(rs.getString(4));
			books.add(book);
		}
		return books;
		
		
		
	}

}
