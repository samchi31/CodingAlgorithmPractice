package codepractice.basicmath2;
//소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int k = 2;
		boolean isTrue = true;
		while (true) {
			for (int i = 3; i < k; i++) {
				if (k % i == 0) {
					isTrue = false;
					break;
				}
			}
			if (isTrue) {
				if (n % k == 0) {
					System.out.println(k);
				} else {
					k++;
				}
			}
			if (n == k) {
				break;
			}
		}
	}
}
