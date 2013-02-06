import java.util.ArrayList;
import java.util.Collections;

public class ShortPalindromes {

	public String shortest(String base) {

		return recCall(base);
	}

	public String recCall(String str) {
		if (str.length() == 1)
			return str;
		if (str.length() == 2 && str.charAt(0) == str.charAt(1))
			return str;
		if (str.charAt(0) == str.charAt(str.length() - 1))
			return str.charAt(0) + recCall(str.substring(1, str.length() - 1))
					+ str.charAt(0);
		String first = str.charAt(0) + recCall(str.substring(1))
				+ str.charAt(0);
		String second = str.charAt(str.length() - 1)
				+ recCall(str.substring(0, str.length() - 1))
				+ str.charAt(str.length() - 1);
		
		if (first.length() == second.length()) {
			ArrayList<String> al = new ArrayList<String>();
			al.add(first);
			al.add(second);
			Collections.sort(al);
			return al.get(0);
		}
		if (first.length() < second.length())
			return first;
		else
			return second;

	}
}
