package Day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		Object a[] = {100, 10.5, 'A', "WELCOME", true};

        /*for(Object x:a)
        {
            System.out.println(x);
        }*/

        for(int i=0; i<a.length-1; i++)
        {
            System.out.println(a[i]);
        }
	}
}
