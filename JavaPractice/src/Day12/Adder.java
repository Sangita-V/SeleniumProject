package Day12;

public class Adder {

	int a=10, b=20;
	void sum()
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		System.out.println("int,int "+ (x+y));
	}

	void sum(int x, double y)
	{
		System.out.println( x+y +" int,double ");
	}
	
	void sum(double x, int y)
	{
		System.out.println("double,int "+ (x+y));
	}
	
	void sum(int x, int y, int z)
	{
		System.out.println("int,int,int "+ (x+y));
	}
}
