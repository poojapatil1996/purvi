package javaprogram;

public class Arithmetic1 {
	public int sum(int a,int b) 
	{
		int c = a+b;
		return c;
	} 
	public int sub(int a,int b)
	{
		int c = a-b;
		return c;
	}
	public int mul(int a,int b)
	{
		int c = a*b;
		return c;
	}
	public void div (int a,int b)
	{
		int c = a/b;
		System.out.println("result of(((((10+2)+2)-2)*2)/2)is:"+c);
	}

	public static void main(String[] args) {
		Arithmetic1 ref = new Arithmetic1();
		int sumresult=ref.sum(10,2);
		int sumresult1=ref.sum(sumresult,2);
		int sumresult2=ref.sub(sumresult1,2);
		int sumresult3=ref.mul(sumresult2,2);
		ref.div(sumresult3,2);
		

	}

}
