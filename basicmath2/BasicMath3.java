package codepractice.basicmath2;
//소인수분해

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		boolean[] arr = new boolean[n + 1];
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			for (int j = i * i; j < n; j++) {
//				if (j % i == 0) {
//					arr[j] = true;
//				}
//			}
//		}
//		for (int i = 2; i < Math.sqrt(arr.length); i++) {
//			if (arr[i] == false) {
//				if (n % i == 0) {
//					System.out.println(i);
//					n /= i;
//					i--;
//				}
//			}
//		}
		
//		for(int i= 2; i<=n;i++) {
//			while(n%i==0) {
//				System.out.println(i);
//				n /= i;
//			}
//		}
		for(int i= 2; i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				n /= i;
				i--;
			}
		}
	}
}
