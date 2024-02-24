package revers;

public class rstring {

	public static String revers(String srt) {

		return revers(srt.substring(0)+ srt.charAt(0) );
	}

	public static void main(String[] args) {
		String srt = "hii darsha k patel";
		String reversed = revers(srt);
		System.out.println(reversed);

	}

}
