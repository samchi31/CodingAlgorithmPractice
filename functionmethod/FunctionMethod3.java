package codepractice.functionmethod;

//한수
import java.util.Scanner;

public class FunctionMethod3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int count = 0;
		for (int i = 1; i <= num; i++) {
			int temp = i;
			if (!function(temp)) {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}

	public static boolean function(int num) {
		int tmp = num;
		int i = 0;
		while (true) {
			tmp /= 10;
			i++;
			if (tmp == 0) {
				break;
			}
		}
		if (i > 2) {
			int[] arr = new int[i];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = num % 10;
				num /= 10;
			}

			for (int k = 0; k < arr.length-2; k++) {
				if (arr[k] - arr[k + 1] != arr[k + 1] - arr[k + 2]) {
					return false;
				}
			}
		}
		return true;
	}
}
