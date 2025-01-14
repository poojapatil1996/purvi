package javaprogram;

public class Method {

	public Method(int a,int b,int c)
	{
		System.out.println("three parameterized method.");
	}
	public Method()
	{
		this(1,2,3);
		System.out.println("default merhod.");
	}
	public Method(int a)
	{
		this();
		System.out.println("one parameterized method.");
	}
	public Method(int a,int b,int c,int d)
	{
		this(0);
		System.out.println("four parameterized method.");
	}
	public Method(int a,int b)
	{
		this(0,0,0,0);
		System.out.println("two parameterized method.");
	}

	public static void main(String[] args) 
	{
		Method obj = new Method(1,2);
	

	}

}
