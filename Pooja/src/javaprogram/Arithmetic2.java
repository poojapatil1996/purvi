package javaprogram;

public class Arithmetic2 {
	public int multi(int a,int b)
	{
		int c;
		c = a*b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c;
		c = a-b;
		return c;
	}
	public int sum(int a,int b)
	{
		int c;
		c = a+b;
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c = a/b;
		System.out.println("final result is:" +c);
	}

	public static void main(String[] args) {
		System.out.println("((((10*2)-2)+2)-2)/2)");
		Arithmetic2 ref = new Arithmetic2();
		int multi = ref.multi(10,2);
		System.out.println("result of multi:"+multi);
		int sub = ref.sub(multi,2);
		System.out.println("result of sub: "+sub);
		int sum = ref.sum(sub,2);
		System.out.println("result of sum: "+sum);
		int sub1 = ref.sub(sub,2);
		System.out.println("result of sub:"+sub);
		ref.div(sub,2);		
		

	}

}
