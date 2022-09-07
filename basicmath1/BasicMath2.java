package codepractice.basicmath1;
// 벌집
// 다시풀어보기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMath2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int i = 0;
		while(true) {
			if(Method(i) >= num) {
				break;
			}
			i++;
		}		
		System.out.println(i+1);
		
		/*
		 * 처음 짠 코드
		 * 1 넣으면 답 1인데 엉뚱한값나옴 - > 수정함
		 */
//		int i = 0;
//		int nextRoom = 1;
//		while (true) {
//			nextRoom = i * 6 + nextRoom;
//			if (num <= nextRoom) {
//				break;
//			}
//			i++;
//		}
//		System.out.println(i+1);
	}
	
	static int Method(int num) {
		if(num == 0) {
			return 1;
		}
		return num * 6 + Method(num -1);
	}
}
