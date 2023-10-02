package lab2;

//day fibonacci
public class Fibonacci {
	public static int getFibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			return getFibonacci(n - 2) + getFibonacci(n - 1);
		}
	}

//in ra day fibonacci
	public static void printFibonacci(int n) {
		int[] res = new int[n + 1];// do dai mang se lon hon so n 1 don vi
		int index = 0;
		for (int i = 0; i < res.length-1; i++) {
			res[index++] = getFibonacci(i);
			System.out.print(res[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println(getFibonacci(3));
		printFibonacci(3);
	}
}
