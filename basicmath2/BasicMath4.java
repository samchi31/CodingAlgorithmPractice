package codepractice.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int m = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
		String[] arrStr = new String[2];
		arrStr = br.readLine().split(" ");
		int m = Integer.parseInt(arrStr[0]);
		int n = Integer.parseInt(arrStr[1]);
		boolean[] arr = new boolean[n + 1];
		
		arr[0] = true;
		arr[1] = true;

		for (int i = 2; i <= Math.sqrt(arr.length); i++) {
			for (int j = i * i; j < arr.length; j++)
				if (j % i == 0) {
					arr[j] = true;
				}
		}

		for (int i = m; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.println(i);
			}
		}
	}
}
