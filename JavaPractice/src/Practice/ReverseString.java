package Practice;

public class ReverseString {
	public static void main(String[] args) {
        
	  String str = "Hello, Hi, how are you?".toLowerCase();
      
      for(int i=0;i<str.length(); i++)
      {
          char ch1=str.charAt(i);
          for(int j=i+1;j<str.length();j++)
          {
              char ch2=str.charAt(j);
              if(ch1==ch2)
              {
                  System.out.print(ch2);
              }
          }
          
      }
}
}
