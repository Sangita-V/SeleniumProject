package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataInArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<a.length; i++)
        {
            System.out.println("Enter a value:");
            a[i] = sc.nextInt();
        }

        System.out.println("printing array elements......." + Arrays.toString(a));
    }
}