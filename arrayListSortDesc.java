package assignmen_2;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arrayListSortDesc 
{
		public static void main(String[] args) {
			
			ArrayList<BigInteger> al = new ArrayList<>();

			System.out.println("Enter number of Elements in ArrayList:");
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			BigInteger arr[] = new BigInteger[n];
			System.out.println("Enter Elements in ArrayList:");
			for(int i=0;i<n;i++) 
			{
				arr[i] = sc.nextBigInteger();
				
			}
			
			for(int i=0;i<n;i++)
			{
				al.add(arr[i]);
				
			}
			
			Arrays.sort(arr);
			
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i] + ",");
				
			}
			//descending order sorting method 
			arrayListSortDesc(al);
			
				
			}

		private static void arrayListSortDesc(ArrayList<BigInteger> al) {
			Collections.sort(al);
			Collections.reverse(al);
			System.out.println();
			System.out.println(al);
			
			
		}
	

}
