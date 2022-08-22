package codepractice.string;
import java.util.Scanner;

public class String2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i < str.length() - 1) {
				if ((str.charAt(i) == 'c' && str.charAt(i + 1) == '=')
						|| (str.charAt(i) == 'c' && str.charAt(i + 1) == '-')
						|| (str.charAt(i) == 'd' && str.charAt(i + 1) == '-')
						|| (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j')
						|| (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j')
						|| (str.charAt(i) == 's' && str.charAt(i + 1) == '=')
						|| (str.charAt(i) == 'z' && str.charAt(i + 1) == '=')) {
					i++;
				}
			} 
			if (i < str.length() - 2) {
				if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
					i += 2;
				}
			}
			count++;
		}

		System.out.println(count);
	}
}
