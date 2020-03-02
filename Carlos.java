package twoDArray;

public class Carlos {

	public static void main(String[] args) {
		int[][] a = new int[4][7];
		int[][] b = { { 1, 2, 3, 4 }, { 9, 8, 7, 6, 5 }, { 7, 6, 2, 5, 8 } };
		genrate2dArray(a);
		for (int i = 0; i < b.length; i++) {

			if (!isSorted(b[i])) {
				System.out.println(getsum(b[i]));
			}

		}

	}

	private static void genrate2dArray(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				a[i][j] = (int) (Math.random() * (10 + 1 - 0)) + 0;

			}

		}
	}

	static boolean isSorted(int[] a) {
		boolean result = true, result2 = true;
		for (int i = 0; i < a.length - 1; i++)
			if (a[i] < a[i + 1])
				result = false;

		for (int i = 0; i < a.length - 1; i++)
			if (a[i] > a[i + 1])
				result2 = false;

		return result || result2;
	}

	private static int getsum(int[] is) {
		int sum = 0;
		for (int i : is) {
			sum += i;

		}
		return sum;

	}
}
