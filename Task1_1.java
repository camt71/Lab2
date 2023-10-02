package lab2;

public class Task1_1 {

//1
	public static int getSn1(int n) {
		if (n == 1)
			return 1;
		else
			return (int) (getSn1(n - 1) + Math.pow(-1, n + 1) * n);// mũ
	}

//2
	public static int giaithua(int n) {
		if (n == 1)
			return 1;
		else
			return giaithua(n - 1) * n;

	}

	public static int getSn2(int n) {
		if (n == 1)
			return 1;
		else
			return (n * giaithua(n - 1) + getSn2(n - 1));

	}

//3
	public static int getSn3(int n) {
		if (n == 1)
			return 1;
		else
			return getSn3(n - 1) + n * n;
	}

//4
	public static double denominator(int n) {
		if (n == 1)
			return 2;
		else
			return denominator(n - 1) * 2 * n;
	}

	public static double getSn4(int n) {
		if (n == 0)
			return 1;
		else
			return getSn4(n - 1) + 1 / denominator(n);
	}


	public static void main(String[] args) {
		System.out.println(getSn1(3));
		System.out.println(getSn2(4));
		System.out.println(getSn3(4));
		System.out.println(getSn4(3));
	
	}
}