package Jan6;

import java.util.Iterator;

public class Maximum_Number {

	public static void main(String[] args) {
		
		int[] a= {120,46,6,444,87,90};
		int max=0;
		int min=0;
		for(int arr:a) {
			if(arr>max) {
				max=arr;
			}
		}
		System.out.println("The Maximum Number in array is "+max+" "+min);

	}
	




}
