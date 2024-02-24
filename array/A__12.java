package array;

public class A__12 {

	public static void main(String[] args) {

		int arr[] = { 42, 32, 13, 45, 456, 76, 45, 24, 35, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int flag = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = flag;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
