package com.revature.bookdao;

import com.revature.model.Book;

public class TestUpdateBookPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book();
		book.setName("english");
	
		UpdateBookPrice ubp=new UpdateBookPrice();
		try 
		{
			ubp.updatebookprice(book);
		} 
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
