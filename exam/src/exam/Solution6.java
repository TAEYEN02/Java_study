package exam;

public class Solution6 {

	public int solution1(int a) {
		int sum = 0;

		for (int i = 0; i < a; i++) {
			sum += i;
		}
		return sum;
	}

	public int solution2(int N) {
		return N + solution1(N);
	}

	public int solution3(int N) {
		return N * (N + 1) / 2;
	}

	public static void main(String[] args) {

	}
}
