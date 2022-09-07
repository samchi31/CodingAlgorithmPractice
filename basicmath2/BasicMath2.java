package codepractice.basicmath2;
//소수

// 다시 풀기 (전체탐색..?
/*
 * n까지의 소수 구하기
 * arr[n+1] 선언, 배열 인덱스 0 부터니까 그냥 n+1 함
 * 0과 1 빼고 2부터 시작
 * 분자는 arr[j], 분모는 i 
 * 루트(i)인 이유는 끝까지  할 필요 없고 반만 하면 된다고 한다. 예) 6의 소인수분해 1 2 3 6 -> 1이랑 2만해도됨
 * j 는 해당 값의 두배 부터. 2면 4부터 제외, 3이면 6부터 제외
 * 0으로 나누어 떨어지는 자연수이면 true로 바꿈 -> false 이면 소수
 * 0 ~ n 까지 소수인지 아닌지 전부 구할 수 있다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		boolean[] arr = new boolean[n + 1];
		

		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			for (int j = i * 2; j < arr.length; j++)
				if (j % i == 0) {
					arr[j] = true;
				}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int m = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
//
//		int count = 0;
//		int sum = 0;
//		boolean isPrime = true;
//		
//		int first = -1;
//		for (int i = m; i <= n; i++) {
//			isPrime = true;
//			if (i == 1) {
//				continue;
//			}
//			if (i == 2) {
//				count++;
//				if(count == 1) {
//					first = i;
//				}
//				sum += i;
//				continue;
//			}
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					isPrime = false;
//					break;
//				}
//			}
//			if (isPrime) {
//				count++;
//				if(count == 1) {
//					first = i;
//				}
//				sum += i;
//			}
//		}
//		if (count == 0) {
//			System.out.println(-1);
//		} else {
//			System.out.println(sum);
//			System.out.println(first);
//		}
	}
}
