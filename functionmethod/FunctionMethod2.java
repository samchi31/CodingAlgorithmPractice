package codepractice.functionmethod;

//셀프 넘버
public class FunctionMethod2 {
	public static void main(String[] args) {

		int i = 1;
		while (i <= 10000) {
			if (count(i)) {
				System.out.println(i);
			}
			i++;
		}

	}

	public static boolean count(int num) {
		for (int m = 1; m < num; m++) {
			int tmp = m;
			int result = m;
			while(true) {
				result = result + tmp % 10;
				tmp = tmp / 10;
				if(tmp == 0) {
					break;
				}
			}
			if (result == num) {
				return false;
			}
		}
		return true;
	}
}
