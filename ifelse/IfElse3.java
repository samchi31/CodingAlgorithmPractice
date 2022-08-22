package codepractice.ifelse;

import java.util.Scanner;
//주사위 세개
public class IfElse3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[3];
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();

		int total = 0;
		if ((arr[0] == arr[1] && arr[1] == arr[2])) {
			total = 10000 + arr[0] * 1000;
		} else if (arr[0] == arr[1] || arr[0] == arr[2]) {
			total = 1000 + arr[0] * 100;
		} else if (arr[1] == arr[2]) {
			total = 1000 + arr[1] * 100;
		} else {
			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			total = max * 100;
		}
		
		System.out.println(total);
	}
}
