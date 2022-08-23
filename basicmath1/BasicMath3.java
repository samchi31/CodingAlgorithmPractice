package codepractice.basicmath1;
//분수 찾기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		int i = 1;
		while (true) {
			if (num <= method(i)) {
				break;
			}
			i++;
		}
		//System.out.println(i + ":" + num);
		if (i % 2 == 0) {
			System.out.println((num - method(i - 1)) + "/" + (method(i) - num + 1));
		} else {
			System.out.println((method(i) - num + 1) + "/" + (num - method(i - 1)));
		}
	}

	static int method(int num) {
		if (num <= 0) {
			return 0;
		}
		return num + method(num - 1);
	}
}
