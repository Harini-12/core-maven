package com.revature.bookdao;

public class TestFindAllBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindAllBook fb=new FindAllBook();
		try 
		{
			System.out.println(fb.findall());
	    }
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
