package Jan6;

import java.util.Scanner;

public class Sum_of__Array {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size=sc.nextInt();
		int array1[]=new int[size];
		
		System.out.println("Enter "+size+" Element in Array");
		for (int i = 0; i < array1.length; i++) {
			array1[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < array1.length; i++) {
			sum=sum+array1[i];
		}
		
		System.out.println("The Array Element are : ");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("The Sum of an Array is "+sum);

	}

}
