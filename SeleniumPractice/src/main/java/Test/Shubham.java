package Test;

public class Shubham {

	public static void main(String[] args) {
		
		String text = "showing 1 to 20 of 8511 (426 pages)";
		
		int indexOf = text.indexOf("(");
		int indexOf1 = text.indexOf("pages");
//		System.out.println(indexOf);
		String substring = text.substring(indexOf+1,indexOf1-1);
		System.out.println(substring);
	
	}
}
