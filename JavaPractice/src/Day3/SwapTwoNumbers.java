package Day3;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=20, b=30;
		System.out.println("Before swapping: "+ "a="+ a + ", b=" + b);
		
		//Using arithmetic +  - operator
		/*
		 * a=a+b; //50 
		 * b=a-b; //20 
		 * a=a-b; //30 
		 * System.out.println("after swapping: "a="+ a + ", b=" + b);
		 */
		
		//using Using arithmetic *  / operator
//		a=a*b;   //600
//		b=a/b;  //20
//		a=a/b;
//		System.out.println("after swapping: "+ "a="+ a + ", b=" + b);

		//using temporary variable
		int c=a;
		a=b;
		b=c;
		System.out.println("after swapping: "+ "a="+ a + ", b=" + b);
		
		//using  bitwise operator
		/*
		 * a=a^b; 
		 * b=a^b; 
		 * a=a^b; 
		 * System.out.println("after swapping: "+ "a="+ a + ", b=" + b);
		 */
		
		
	}
}
