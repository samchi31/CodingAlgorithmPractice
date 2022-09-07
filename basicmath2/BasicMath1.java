package codepractice.basicmath2;
//소수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] arr = new String[n];
		arr = br.readLine().split(" ");
		int count = 0;
		boolean isPrime = true;
		for (int i = 0; i < n; i++) {
			isPrime = true;
			if (Integer.parseInt(arr[i]) == 1) {
				continue;
			}
//			if (Integer.parseInt(arr[i]) == 2) {
//				count++;
//				continue;
//			}
			for (int j = 2; j < Integer.parseInt(arr[i]); j++) {
				if (Integer.parseInt(arr[i]) % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
