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
			if(cnt[max]<cnt[i]) {
				max= i;
			}
			else if(!isSecond && cnt[max]==cnt[i] && cnt[i] != 0) {
				isSecond=true;
				max=i;
			}
		}
		maxValue = max-4000+"\n";
		// 2
		for(int i=1;i<cnt.length;i++) {
			cnt[i] += cnt[i-1];
		}
		// 3
		for(int i=0;i<arr.length;i++) {
			int value = arr[i];
			cnt[value+4000]--;
			result[cnt[value+4000]] = value;
		}
		
		sb.append(result[(t+1)/2-1] + "\n");
		sb.append(maxValue);
		sb.append(result[t-1]-result[0]+"\n");
		System.out.println(sb);
	}
}
