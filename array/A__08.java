package array;

public class A__08 {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,3,45,89,5,89,4,66};
		
		int max = a[0];
		int secondmax = a[1];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
			{
			    secondmax = max;
				max = a[i];
			}
			else if(a[i]>secondmax || a[i]!=max)
			{
				secondmax = a[i];
			}
		}
		
		System.out.println("Max is : "+max);
		System.out.println("secondmax : "+secondmax);
		
	}
}