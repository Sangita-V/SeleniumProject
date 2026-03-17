package Day19;

class Parent
{
	int p=23;
	
	void parentClassMethod()
	{
		System.out.println("This is parent class method");
	}
}

class Child extends Parent
{
	int c=56;
	
	void childClassMethod()
	{
		System.out.println("This is child class method");
	}
}

public class TypeCastingObjects {

	public static void main(String[] args) {
		/*
		Child cobj=new Child();
		System.out.println(cobj.c);
		cobj.childClassMethod();
		
		System.out.println(cobj.c);
		cobj.parentClassMethod();
		*/
		
		//Upcasting 
//		Parent pobj=new Child();
//		System.out.println(pobj.p);
//		pobj.parentClassMethod();
//		((Child) pobj).childClassMethod();
		
		//downcasting - an not access certain variables from child class so not prefered most times
		Parent obj=new Parent();
		System.out.println(obj.p);
		obj.parentClassMethod();
		((Child) obj).childClassMethod();  //not possible
		
	}

}
