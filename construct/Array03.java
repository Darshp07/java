package construct;

class marks {

	public int per(int x, int y, int z) {

		double sum = x + y + z;
		double p = sum / 300 * 100;

		if (p > 35) {
			System.out.println("your pass");
		} else {
			System.out.println("you are fail");
		}
		return 0;
	}

}

public class Array03 {
	public static void main(String[] args) {

		marks std1 = new marks();

		std1.per(34, 56, 78);
		marks std2 = new marks();

		std2.per(6, 12, 1);
	}

}
