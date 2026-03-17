package Day13;

public class StaticKeyword {

	static int a=20;  //static variable
	int b=30;       //non static variable
	
	void m1()
	{
		System.out.println("this is non static method");
	}
	
	static void m2()
	{
		System.out.println("this is static method");
	}
	
	static public void main(String[] args) {

		System.out.println(a);;
		m2();

		StaticKeyword sk=new StaticKeyword();
		System.out.println(sk.b);
		sk.m1();
	}
}
