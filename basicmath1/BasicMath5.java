package codepractice.basicmath1;

//ACM 호텔
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int caseNum = Integer.parseInt(br.readLine());

		String[] arrStr = new String[3];
		String[] result = new String[caseNum];

		for (int t = 0; t < caseNum; t++) {
			arrStr = br.readLine().split(" ");
			int h = Integer.parseInt(arrStr[0]);
			int w = Integer.parseInt(arrStr[1]);
			int n = Integer.parseInt(arrStr[2]);
			int count;
			if(n % h == 0) {
				count = n / h;
				result[t]= h + String.format("%02d", count);
			} else {
				count = n / h + 1;
				result[t]= (n % h) + String.format("%02d", count);
			}
		}
		for (int i = 0; i < caseNum; i++) {
			System.out.println(result[i]);
		}
	}
}
