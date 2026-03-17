package Day19;

public class TypeCasting {

	public static void main(String[] args) {
		
		//UPcasting - smaller to higher
		/*int intvalue=300;
		long longval=intvalue;
		System.out.println(longval);
		
		float fval=40.89F;
		double dval=fval;
		System.out.println(dval);*/
		
		//Downcasting - higher to lower 
		long lval=45679;
		int intval=(int) lval;
		System.out.println(intval);
		
		double dval=987.5678;
		float fval=(float) dval;
		System.out.println(fval);
	}
	
}
