package codepractice.basicmath2;

// 골드바흐의 추측
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath6 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BasicMath6 clazz = new BasicMath6();
		boolean[] prime = clazz.getPrime();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		while (i < n) {
			int num = Integer.parseInt(br.readLine());

			int tmp1 = num;
			int tmp2 = num;

			int ret = 0;

			for (int x = 2; x <= num - x; x++) {
				if (prime[x] == false && prime[num - x] == false) {
//					System.out.println(x + "," + (num - x));
					tmp2 = num - x - x;
					if (tmp1 > tmp2) {
						tmp1 = tmp2;
						ret = x;
					}
				}
			}
			System.out.println(ret + " " + (num - ret));
			i++;
		}
	}

	public boolean[] getPrime() {
		boolean[] arr = new boolean[10001];
		arr[0] = true;
		arr[1] = true;

		for (int i = 2; i < Math.sqrt(arr.length); i++) {
			for (int j = i * i; j < arr.length; j += i) {
				if (j % i == 0) {
					arr[j] = true;
				}
			}
		}

		return arr;
	}
}
