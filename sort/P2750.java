package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] arr = new int[t];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 선택 정렬
		int minIndex = arr.length;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}

//		// 삽입 정렬
//		for (int i = 1; i < arr.length; i++) {
//			int tmp = arr[i];
//			int j = i - 1;
//			while (j >= 0) {
//				if (tmp < arr[j]) {
//					arr[j + 1] = arr[j];
//					j--;
//				}
//			}
//			arr[j + 1] = tmp;
//		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
