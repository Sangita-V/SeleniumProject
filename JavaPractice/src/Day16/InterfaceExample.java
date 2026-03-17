package Day16;

interface Rbi
{
	void payment();    //public abstract method
	void rules();     //public abstract method
	
	default void branch()
	{
		System.out.println("This is default method from inheritance");
	}
	
	static void atm()
	{
		System.out.println("This is static method from inheritance");
	}
}

class Sbi implements Rbi
{
	@Override
	public void payment() {
		System.out.println("This is abstract method Sbi payment");
	}

	@Override
	public void rules() {
		System.out.println("This is abstract method Sbi rules");
	}
	
	public void sbimethod() {
		System.out.println("sbi method");
	}
}

class Axis implements Rbi
{
	@Override
	public void payment() {
		System.out.println("This is abstract method Axis payment");
	}

	@Override
	public void rules() {
		System.out.println("This is abstract method Axis rules");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Axis a=new Axis();
		a.payment();
		a.rules();
		a.branch();
		Rbi.atm();
		
		Rbi r=new Sbi();
		r.payment();
		r.rules();
		r.branch();
		Rbi.atm();
		
	}
}
