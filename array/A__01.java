package array;

public class A__01 {

	public static void main(String[] args) {

		int a[] = { 12, 243, 241, 12, 42, 53, 3, 5, 23, 223 };
		int sum = 0;
		System.out.println(a[4] + a[6]);

		System.out.println("*************");

		for (int i = 0; i < a.length; i++) {
			System.out.println(i + " num is =" + a[i] + " ");
			sum += a[i];

		}
		System.out.println("**********************");
		System.out.println("sum is :" + sum);
	}
}
