package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	// 1~10,000,000

		int[] arr = new int[t];
		int[] cnt = new int[100001];	// 1~100000
		int[] result = new int[t];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// counting 정렬
		// 1 
		for (int item : arr) {
			cnt[item]++;
		}
		// 2
		for(int i=1;i<cnt.length;i++) {
			cnt[i] += cnt[i-1];
		}
		// 3
		for(int i=0;i<arr.length;i++) {
			/*
			 * i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
			 * counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다
			 */
			int value = arr[i];
			cnt[value]--;
			result[cnt[value]] = value;
		}
		
		for (int i=0;i<result.length;i++) {
			sb.append(result[i]+"\n");
		}
		System.out.println(sb);
	}
}
