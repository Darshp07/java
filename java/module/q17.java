//W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red?
package module;

public class q17 {
	public static void main(String[] args) {
		String str1= "Red is favorite color";
		String str2 = "orange is also my favrite color";
		String ste3 ="Red";
		
		System.out.println(" str1 Starts with red: "+str1.startsWith(ste3));
		System.out.println("str2 starts with red: "+str2.startsWith(ste3));
	}

}
