package codepractice.loop;

//더하기 사이클
import java.util.Scanner;
public class ForWhile1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int p = scanner.nextInt();
		int tmp = p;
		int i = 0;
		while (true) {
			int q = p / 10;
			int r = p % 10;
			p = r * 10 + (r + q)%10;						
			
			i++;
			if(tmp == p) {
				break;
			}			
		}
		System.out.println(i);
	}
}
