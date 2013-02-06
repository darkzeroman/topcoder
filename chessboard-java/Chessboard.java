import java.util.Hashtable;

public class Chessboard {

	public String changeNotation(String cell) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("a", 1);
		ht.put("b", 2);
		ht.put("c", 3);
		ht.put("d", 4);
		ht.put("e", 5);
		ht.put("f", 6);
		ht.put("g", 7);
		ht.put("h", 8);

		Hashtable<Integer, String> htt = new Hashtable<Integer, String>();
		htt.put(0, "a");
		htt.put(1, "b");
		htt.put(2, "c");
		htt.put(3, "d");
		htt.put(4, "e");
		htt.put(5, "f");
		htt.put(6, "g");
		htt.put(7, "h");

		if (Character.isLetter(cell.charAt(0))) {
			System.out.println(cell);
			return Integer.toString((ht.get(cell.charAt(0) + "") + (Integer
					.parseInt(cell.charAt(1) + "") - 1) * 8));
		} else {
			int num = Integer.parseInt(cell) / 8;
			return htt.get(Integer.parseInt(cell) - num * 8 - 1) + ""
					+ (num + 1);
		}
	}
}
