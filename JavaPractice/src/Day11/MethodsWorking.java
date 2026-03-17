package Day11;

public class MethodsWorking {
	
	// 1) No params  No return value
	void m1()
	{
	    System.out.println("Hello...");
	}

	// 2) No params  Return value
	String m2()
	{
	    return("hello how are you?");
	}

	// 3) Takes params  No return value
	void m3(String name)
	{
	    System.out.println("Hello " + name);
	}
	
	//4) Takes params    Returns value
	String m4(String name)
	{
	    return("Hello " + name);
	}
	
	
	public static void main(String[] args) {
		
		MethodsWorking mw = new MethodsWorking();

		mw.m1();    // (1)
        
        String s = mw.m2();    // (2)
        System.out.println(s);

        mw.m3("John");  //3
        
        String st=mw.m4("Joe");
        System.out.println(st);
	}

}
