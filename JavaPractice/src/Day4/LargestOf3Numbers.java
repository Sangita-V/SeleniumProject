package Day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=80, b=50, c=70;
		
		if(a>b && a>c) {
			System.out.println("a is a largest number");
		}
		else if(b>a && b>c) {
			System.out.println("b is a largest number");
		}
		else {
			System.out.println("c is a largest number");
		}
		
	}

}
