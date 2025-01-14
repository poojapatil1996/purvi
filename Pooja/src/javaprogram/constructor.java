package javaprogram;

public class constructor {

	public constructor(int a,int b,int c) 
	{
		System.out.println("three parameterized constructor.");
	}
	public constructor()
	{
		this(8,9,0);
		System.out.println("default constructor.");
	}
	public constructor(int a)
	{
		this();
		System.out.println("one parameterized constructor.");
	}
	public constructor(int a,int b)
	{
		this(0);
		System.out.println("two parameterized constructor.");
	}

	public static void main(String[] args) 
	{
		constructor obj = new constructor(0,0);
	}

}
