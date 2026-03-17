package Day15;

class Animals
{
	 String name="Fish";
	
	void pets()
	{
		System.out.println("Cat");
	}
}

class Dog extends Animals
{
	String name="Elephant";
	
	void pets()
	{
		System.out.println(super.name);     
		super.pets();
	}
}


public class SuperKeyword {
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.pets();
	}
}
