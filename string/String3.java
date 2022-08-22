package codepractice.string;

//그룹 단어 체커
import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		int size = Integer.parseInt(scanner.nextLine());
		String[] arrStr = new String[size];

		for (int i = 0; i < size; i++) {
			arrStr[i] = scanner.nextLine();
		}

		System.out.println(Function(arrStr));
	}

	static int Function(String[] arrStr) {
		int count = 0;
		boolean isGroup = true;

		for (int i = 0; i < arrStr.length; i++) {
			isGroup = true;
			for (int j = 0; j < arrStr[i].length(); j++) {
				for (int k = 0; k < j; k++) {
					if (arrStr[i].charAt(j) == arrStr[i].charAt(k)) {
						for(int m = k; m <= j;m++) {
							if(arrStr[i].charAt(j) != arrStr[i].charAt(m)) {
								isGroup = false;
								break;
							}
						}						
					}
				}
			}
			if (isGroup) {
				count++;
			}
		}
		return count;
	}
}
