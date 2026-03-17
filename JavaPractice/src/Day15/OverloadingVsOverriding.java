package Day15;
	
	class Bank
	{
		void ifsc() 
		{
			System.out.println("ifsc code is 0");
		}
		
		void branch(int code)
		{
			System.out.println("The code is "+ code);
		}
	}
	
	class SBI extends Bank
	{
		void ifsc()      //Overriding
		{
			System.out.println("ifsc code is 12");
		}
		
		void branch(int code, String name)    //Overloading
		{
			System.out.println("The branch code and name is "+code+ " & " +name);
		}
	}
	
	class Axis extends Bank
	{
		void ifsc()
		{
			System.out.println("ifsc code is 34");
		}
	}

	
	public class OverloadingVsOverriding {
		public static void main(String[] args) 
		{
			Axis a=new Axis();
			a.ifsc();
			
			SBI s=new SBI();
			s.ifsc();
			s.branch(63);
			s.branch(87, "Pune");
			
			Bank b=new Bank();
			b.branch(32);
			b.ifsc();
		}
	}