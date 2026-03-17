package DemoRe;

public class ConstructorDemo {
	
	static int i;
	int age ;
//	static {
//		i=10;
//		System.out.println(i);
//		System.out.println("Static block");
//	}
	
	{
		System.out.print("Age is : ");
	}
	
	ConstructorDemo(int a) {
//		System.out.println("Hello");
		this.age = a;
	}

	ConstructorDemo() {
		System.out.println("Hi");
	}

	void m1(int i) {
		int id=i;
		System.out.println(id);
	}
	
	void age() {
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo sangita = new ConstructorDemo(29);
		sangita.age();	
		
		ConstructorDemo shubham = new ConstructorDemo(30);
		shubham.age();	
		
		ConstructorDemo saurabh = new ConstructorDemo(27);
		saurabh.age();	
	}
	
	
}
