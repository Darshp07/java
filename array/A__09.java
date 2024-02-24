package array;

public class A__09 {
	public static void main(String[] args) {
		
		
		int a[] = {10,2,20,3,45,89,5,89,12,4,66};
		
		int small = a[0];
		int secondsmall = a[1];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<small)
			{
			    secondsmall = small;
				small= a[i];
			}
			else if(a[i]<secondsmall && a[i]!=small)
			{
				secondsmall = a[i];
			}
		}
		
		System.out.println("small is : "+small);
		System.out.println("secondsmall : "+secondsmall);
		
	}
}