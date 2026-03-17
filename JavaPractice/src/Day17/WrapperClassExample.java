package Day17;

public class WrapperClassExample {

	public static void main(String[] args) {

		//String  -->  int, double, boolean
		String str="Welcome";   //not able to convert to numbers like int, long
		
		String mob="987654432";
		System.out.println(Integer.parseInt(mob));
		
		String price="2365.124";
		System.out.println(Double.parseDouble(price));
		
		String bool="false";     //Any value other than true will give output as false
		System.out.println(Boolean.parseBoolean(bool));
		
		//int, double, boolean  -->  String
		
		int no=2314567;
		double mrp=3256.1457;
		boolean b=true;
		char c='R';
		
		System.out.println(String.valueOf(no));
		System.out.println(String.valueOf(mrp));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
	}

}
