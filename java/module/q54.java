
package module;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class q54 {
	public static void main(String[] args) {
		ArrayList<String> countrylist = new ArrayList<String>();
		countrylist.add("India");
		countrylist.add("Pakistan");
		countrylist.add("Srilanka");
		countrylist.add("USA");
		countrylist.add("Australia");
		countrylist.add("Japan");

		System.out.println("without sort array:-" + countrylist);

		Collections.sort(countrylist);
		System.out.println("Accending order: " + countrylist);
		Collections.sort(countrylist.reversed());
		System.out.println("decending order: " + countrylist);

	}
}
