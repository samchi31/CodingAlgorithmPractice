package codepractice.basicmath2;
// 베르트랑 공준
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath5 {
	public static void main(String[] args) throws Exception {
		BasicMath5 klass = new BasicMath5();
		boolean[] prime = klass.getPrime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
//			boolean[] arr = new boolean[2 * n + 1];
//
//			for (int i = n; i < arr.length; i++) {
//				for (int j = 1; j <= Math.sqrt(i); j=j*n) {
//					if (i % j == 0) {
//						arr[i] = true;
//					}
//				}
//			}
//
//			arr[0] = true;
//			arr[1] = true;

			int cnt = 0;
			for (int i = n + 1; i <= 2*n; i++) {
				if (prime[i] == false) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
	
	public boolean[] getPrime() {
		boolean[] arr = new boolean[246913];
		arr[0] = true;
		arr[1] = true;
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for(int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		
		return arr;
	}
}
