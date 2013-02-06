import java.util.*;

public class StripePainter {
	public int minStrokes(String stripe) {
		int[][] dp = new int[stripe.length()][stripe.length()];
		for (int x = 0; x < stripe.length(); x++)
			dp[x][x] = 1;

		for (int size = 1; size < stripe.length(); size++) {
			for (int from = 0; from < stripe.length(); from++) {
				int to = from + size;
				if (to >= stripe.length())
					continue;
				int min = 50;
				for (int x = from; x < to; x++) {
					min = Math.min(min, dp[from][x] + dp[x + 1][to]);
					if (stripe.charAt(x) == stripe.charAt(x + 1))
						min = Math.min(min, dp[from][x] + dp[x + 1][to] - 1);
					if (stripe.charAt(from) == stripe.charAt(to))
						min = Math.min(min, dp[from][x] + dp[x + 1][to] - 1);
				}
				dp[from][to] = min;
			}
		}

		return dp[0][stripe.length() - 1];
	}

	long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	long lcm(long a, long b) {
		return b / gcd(a, b) * a;
	}

	/* TESTING DONE HERE */
	public final static void main(String[] args) {
		try {
			validateExample("1", new StripePainter().minStrokes("RGBGR"), 3,
					"minStrokes(\"RGBGR\")");
			validateExample("2", new StripePainter().minStrokes("RGRG"), 3,
					"minStrokes(\"RGRG\")");
			validateExample("3", new StripePainter().minStrokes("ABACADA"), 4,
					"minStrokes(\"ABACADA\")");
			validateExample("4",
					new StripePainter().minStrokes("AABBCCDDCCBBAABBCCDD"), 7,
					"minStrokes(\"AABBCCDDCCBBAABBCCDD\")");
			validateExample(
					"5",
					new StripePainter()
							.minStrokes("BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEDADD"),
					26,
					"minStrokes(\"BECBBDDEEBABDCADEAAEABCACBDBEECDEDEACACCBEDABEDADD\")");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(System.out);
		}
	}

	private static void validateExample(String exampleNum, int returned,
			int expected, String methodInvocation) {
		print(exampleNum);
		print("  ");
		if (!eq(returned, expected)) {
			print("FAIL");
		} else {
			print("SUCCESS");
		}
		print(" ");
		print(methodInvocation);
		print("\tGot:[");
		print(returned);
		print("]\t");
		print("Expected:[");
		print(expected);
		print("]");
		print("\n");
	}

	public static void print(boolean a) {
		System.out.print(a);
	}

	public static void print(long a) {
		System.out.print(a);
	}

	public static void print(int a) {
		System.out.print(a);
	}

	public static void print(char a) {
		System.out.print(a);
	}

	public static void print(String a) {
		System.out.print(a);
	}

	public static void print(int[] a) {
		if (a == null) {
			System.out.print("null");
			return;
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + (i < a.length - 1 ? "," : ""));
	}

	public static void print(int[][] a) {
		if (a == null) {
			System.out.print("null");
			return;
		}
		for (int i = 0; i < a.length; i++) {
			print(a[i]);
			print("\n");
		}
	}

	public static void print(String[] a) {
		if (a == null) {
			System.out.print("null");
			return;
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + (i < a.length - 1 ? "," : ""));
	}

	public static boolean eq(boolean a, boolean b) {
		return a == b;
	}

	public static boolean eq(long a, long b) {
		return a == b;
	}

	public static boolean eq(int a, int b) {
		return a == b;
	}

	public static boolean eq(char a, char b) {
		return a == b;
	}

	public static boolean eq(String a, String b) {
		return a.equals(b);
	}

	public static boolean eq(int[] a, int[] b) {
		return Arrays.equals(a, b);
	}

	public static boolean eq(String[] a, String[] b) {
		return Arrays.equals(a, b);
	}

}
// Powered by CodeProcessor