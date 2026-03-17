package Day7;

import java.util.Arrays;

public class SortingElementsArray {

	public static void main(String[] args) {

		//char s[] = {'D', 'C', 'B', 'A'};
        String s[] = {"scott", "marry", "john", "David"};

        System.out.println("before sorting...." + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sorting...." + Arrays.toString(s));
	}

}
