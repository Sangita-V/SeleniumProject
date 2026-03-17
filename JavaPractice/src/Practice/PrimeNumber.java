package Practice;
import java.util.*;

public class PrimeNumber {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code onlin

	    public static void main(String[] args) {
	    
//	        Scanner scn = new Scanner(System.in);
//	        System.out.println("Enter Number : ");
//	        int no = scn.nextInt();
//	        int[] a = {2,5,7,9,11,13,15,17};
//	        boolean isprime = isPrime(no);
	        int count=0;
	        for(int i=1;i<=100;i++) {
	        	if(isPrime(i)) {
	        		count++;
	        		System.out.print(i+"  ");
	        	}
	        }
	        System.out.println();
	        System.out.println("count "+count);
	        
//	        if(isprime){
//	            System.out.println("no is prime");
//	        }else{
//	            System.out.println("no is not prime");
//	        }
	    
	    }
	    
	    public static boolean isPrime(int n){
	        int factorCount=0;
	        for(int i=1;i<=n;i++){
	            if(n%i==0){
	                factorCount++;
	            }
	        }
	        return factorCount==2;

	    }
	}
