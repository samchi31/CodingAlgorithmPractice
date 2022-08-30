package codepractice.basicmath1;
// 큰 수 A + B

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = new String[2];
		input = br.readLine().split(" ");

		String[] arrStr = new String[2];
		boolean isOver = false;

		if (input[0].length() >= input[1].length()) {
			arrStr[0] = input[0];
			arrStr[1] = input[1];
		} else {
			arrStr[0] = input[1];
			arrStr[1] = input[0];
		}

		int[] result = new int[arrStr[0].length() + 1];
		int i = 1;
		while (true) {
			if (arrStr[1].length() - i >= 0) {
				result[result.length - i] = Character.getNumericValue(arrStr[0].charAt(arrStr[0].length() - i))
						+ Character.getNumericValue(arrStr[1].charAt(arrStr[1].length() - i));
			} else {
				result[result.length - i] = Character.getNumericValue(arrStr[0].charAt(arrStr[0].length() - i));
			}
			//System.out.println(result[result.length - i]);
			if (isOver) {
				result[result.length - i] += 1;
				isOver = false;
			}

			if (result[result.length - i] > 9) {
				result[result.length - i] -= 10;
				isOver = true;
			}
			i++;
			if (arrStr[0].length() - i < 0) {
				if (isOver) {
					result[0] = 1;
				}
				break;
			}
		}
		for (int n = 0; n < result.length; n++) {
			if(result[n] == 0 && n == 0) {
				continue;
			}
			System.out.print(result[n]);
		}

	}
}
