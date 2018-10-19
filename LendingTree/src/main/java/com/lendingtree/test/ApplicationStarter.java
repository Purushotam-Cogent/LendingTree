package com.lendingtree.test;

public class ApplicationStarter {

	public static void main(String[] args) {
		System.out.println("ApplicationStarter.main()");
		System.out.println("Welcome to Lending Tree.........Apps");
		
		System.out.println("User ID "+Integer.toHexString(new ApplicationStarter().getID()));
		System.out.println("---------------Ended- Addedd-------------------");
	
		

	}
	
	
	public int getID()
	{
		return this.hashCode();
	}

}
