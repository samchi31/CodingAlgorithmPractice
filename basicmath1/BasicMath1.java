package codepractice.basicmath1;
//손익분기점
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class BasicMath1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int fix = Integer.parseInt(strs[0]);
		int variable = Integer.parseInt(strs[1]);
		int price = Integer.parseInt(strs[2]);
		
		if(price - variable<=0) {
			System.out.println(-1);
		}
		else {
			System.out.println(fix / (price - variable) + 1);
		}
		
		//price - variable = 0이 나올 수 있다. 수식 쓸 때 조심하자
//		int breakEvenPoint = fix / (price - variable) + 1;
//		
//		if(breakEvenPoint > 0) {
//			System.out.println(breakEvenPoint);
//		}else {
//			System.out.println(breakEvenPoint);
//		}		

		/* 내가 짠 코드
		 * java의 scanner 함수는 문제가 많다고 한다. -> bufferReader를 사용해보자
		 * 그리고 반복문을 사용하면서 (price - variable) * breakEvenPoint - fix 연산부분에서
		 * 오버플로우가 발생할 수 있다고한다.
		 * 그렇다고 long 타입을 사용 시 반복문으로 오래 걸려 시간 초과가 된다.
		// 고정비용 + 가변비용 * 제조개수
		// Scanner scanner = new Scanner(System.in);
		// A
		// int fix = scanner.nextInt();
		// B
		// int variable = scanner.nextInt();
		// C
		// int price = scanner.nextInt();
		int breakEvenPoint = -1;
		// price * 제조개수 > 고정비용 + 가변비용 * 제조개수
		while (true) {
			if (price - variable < 0) {
				break;
			}
			breakEvenPoint++;
			if ((price - variable) * breakEvenPoint - fix > 0) {
				break;
			}
		}
		System.out.println(breakEvenPoint);
		*/
	}
}
