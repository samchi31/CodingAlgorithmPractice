package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine());	// 1~1000000
//
//		int[] arr = new int[t];
//		int[] cnt = new int[2000001];	// -1000000~1000000
//		int[] result = new int[t];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		// counting 정렬
//		// 1 
//		for (int item : arr) {
//			cnt[item+1000000]++;
//		}
//		// 2
//		for(int i=1;i<cnt.length;i++) {
//			cnt[i] += cnt[i-1];
//		}
//		// 3
//		for(int i=0;i<arr.length;i++) {
//			/*
//			 * i 번째 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
//			 * counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다
//			 */
//			int value = arr[i];
//			cnt[value+1000000]--;
//			result[cnt[value+1000000]] = value;
//		}
//		
//		for (int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		/////////////////////////////////////////////////////////////////////////////
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	// 1~1000000

		StringBuilder sb = new StringBuilder();
		int[] cnt = new int[2000001];	// -1000000~1000000
		int[] result = new int[t];

		for (int i=0;i<t;i++) {
			cnt[Integer.parseInt(br.readLine())+1000000]++;
		}
		for (int i=0;i<cnt.length;i++) {
			if(cnt[i]==1) {
				sb.append(i-1000000+"\n");
			}
		}
		System.out.println(sb);
		
		/*
		 * 중복이 없다는 점에서 위의 과정에서 많은것을 줄일 수 있고
		 * for문 안에서 반복적으로 System.out.println을 사용 시 시간 초과가 걸린다
		 * -> StringBuilder로 한번에 문자열을 출력하는 방법
		 */
	}
}
