package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	// 1~500000

		int[] arr = new int[t];
		int[] cnt = new int[8001];	// -4000 ~ 4000
		int[] result = new int[t];
		int sum = 0;
		int max = 0;
		String maxValue = "";
		Boolean isSecond = false;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		sb.append(Math.round(sum/(double)t) + "\n");
		
		// counting 정렬
		// 1 
		for (int item : arr) {
			cnt[item+4000]++;
		}
		for(int i = 0 ; i<cnt.length;i++) {
			if(cnt[max]<cnt[i])
				max= i;
			if(!isSecond && cnt[max]==cnt[i]) {
				isSecond=true;
				max=i;
			}
		}
		maxValue = cnt[max]+"\n";
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
			cnt[value+4000]--;
			result[cnt[value+4000]] = value;
		}
		for (int i : result) {
			System.out.print(i+",");
		}
		sb.append(result[(t+1)/2-1] + "\n");
		sb.append(maxValue);
		sb.append(result[t-1]-result[0]+"\n");
		System.out.println(sb);
	}
}
