package codepractice.ifelse;


import java.util.Scanner;
//알람 시계
public class IfElse2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if (m >= 45) {
			m -= 45;

		} else {
			m = 60 - 45 + m;
			if (h == 0) {
				h = 23;
			} else {
				h--;
			}
		}
		System.out.println(h+" "+m);
	}
}
