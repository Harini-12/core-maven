package com.revature.bookdao;

import com.revature.model.Book;

public class TestFindByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book();
		book.setName("english");
		FindByName fn=new FindByName();
		try 
		{
			System.out.println(fn.findbyname(book));
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
