package lab2;

public class PascalTriangle {
	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			printArray(getPascalTriangle(i));
			System.out.println();
		}
	}

	public static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
	}

	public static int[] getPascalTriangle(int n) {
		if (n == 1) {
			return new int[] { 1 };
		} else {
			int[] prevRow = getPascalTriangle(n - 1);
			return generateNextRow(prevRow);
		}
	}

	public static int[] generateNextRow(int[] prevRow) {
		int[] res = new int[prevRow.length + 1];
		res[0] = 1;
		res[res.length - 1] = 1;
		for (int i = 1; i < res.length - 1; i++) {
			res[i] = prevRow[i - 1] + prevRow[i];
		}
		return res;
	}

	public static void main(String[] args) {
		printPascalTriangle(5);
	}
}
