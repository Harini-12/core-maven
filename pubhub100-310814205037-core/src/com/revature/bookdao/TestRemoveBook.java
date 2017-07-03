package com.revature.bookdao;

import com.revature.model.Book;

public class TestRemoveBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book();
		book.setName("c");
		RemoveBook rb=new RemoveBook();
		try 
		{
			rb.removebook(book);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
