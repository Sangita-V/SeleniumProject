package DemoRe;

public class NonStaticBlock {
	 
	String  name ;
	
	{
		System.out.println("welcome to office.....");
	}
	
	public NonStaticBlock(String name) {
		this.name = name;
	}
	
	public void welcome() {
		System.out.println("Name of person is : "+name);
	}

	public static void main(String[] args) {

		NonStaticBlock sangita = new NonStaticBlock("sangita");
//		sangita.welcome();	
		
		NonStaticBlock shubham = new NonStaticBlock("shubham");
//		shubham.welcome();	
		
		NonStaticBlock saurabh = new NonStaticBlock("saurabh");
//		saurabh.welcome();	
		
	}

}
