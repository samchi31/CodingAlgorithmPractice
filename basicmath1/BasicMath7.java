package codepractice.basicmath1;

//설탕 배달
// 반복없이 풀어보기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int result = Integer.parseInt(br.readLine());

		int min = 6000;
		for (int i = 0; i <= result/3; i++) {
			for (int j = 0; j <= result/5; j++) {
				if (3 * i + 5 * j == result) {
					//System.out.println(i + "," + j);
					if (min >= i + j) {
						min = i + j;
					}
					break;
				}
			}
		}
		if(min == 6000) {
			min = -1;
		}
		System.out.println(min);
	}
}
