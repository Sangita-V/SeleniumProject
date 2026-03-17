package Day9;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {

		//String - immutable
		String str="Welcome";
		str.concat("to java");
		System.out.println(str);   //Welcome
		
		//StringBuffer - muttable
		StringBuffer sbf=new StringBuffer("Welcom");
		sbf.append(" to java");
		System.out.println(sbf);    //Welcom to java
		
		//StringBuilder - mutable
		StringBuilder sbr=new StringBuilder("Welcom");
		sbr.append(" to java");
		System.out.println(sbr);   //Welcom to java
	}

}
