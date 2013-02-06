import java.util.Hashtable;

/**
 * 
 */

/**
 * @author darkzeroman
 * 
 */
public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("a", 1);

		Hashtable<Integer, String> httwo = new Hashtable<Integer, String>();
		httwo.put(1, "a");

		System.out.println(ht.get("a")); // => 1
		System.out.println(ht.get('a')); // => null
		System.out.println(httwo.get(1));

	}
}
