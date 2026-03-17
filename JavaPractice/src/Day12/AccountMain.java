package Day12;

public class AccountMain {
	public static void main(String[] args) {
		
		Account acc=new Account();
		
		acc.setAccno(123654);
		acc.setName("Aisha");
		acc.setAmount(321456);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
