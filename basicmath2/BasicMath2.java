package codepractice.basicmath2;
//소수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		int sum = 0;
		boolean isPrime = true;
		
		int first = -1;
		for (int i = m; i <= n; i++) {
			isPrime = true;
			if (i == 1) {
				continue;
			}
			if (i == 2) {
				count++;
				if(count == 1) {
					first = i;
				}
				sum += i;
				continue;
			}
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if(count == 1) {
					first = i;
				}
				sum += i;
			}
		}
		if (count == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(first);
		}
	}
}
