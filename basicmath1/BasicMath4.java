package codepractice.basicmath1;
//달팽이는 올라가고싶다

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arrStr = br.readLine().split(" ");

		int a = Integer.parseInt(arrStr[0]);
		int b = Integer.parseInt(arrStr[1]);
		int v = Integer.parseInt(arrStr[2]);
		if ((v - b) % (a - b) == 0) {
			System.out.println((v - b) / (a - b));
		} else {
			System.out.println((v - b) / (a - b) + 1);
		}

	}
}
