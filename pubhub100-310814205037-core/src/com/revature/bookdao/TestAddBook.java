package com.revature.bookdao;

import com.revature.model.Book;

public class TestAddBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book();
		book.setName("m2");
		book.setPrice(250);
		book.setAuthor("shaun");
		AddBook ab=new AddBook();
		try 
		{
			ab.addBook(book);
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
