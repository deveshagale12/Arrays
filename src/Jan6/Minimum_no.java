package Jan6;

public class Minimum_no {

	public static void main(String[] args) {
	
		int[] a= {120,46,6,444,87,90};
	
		int min=a[0];
		for(int i = 0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("The Minimum Number in array is "+min);

	}
}
