package codepractice.array;

//평균은 넘겠지
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int caseNum = scanner.nextInt();
		int[] scores;

		double[] avg = new double[caseNum];
		double[] ratio = new double[caseNum];

		for (int i = 0; i < caseNum; i++) {
			int studentNum = scanner.nextInt();
			scores = new int[studentNum];
			for (int j = 0; j < scores.length; j++) {
				scores[j] = scanner.nextInt();
				avg[i] += scores[j];
			}
			avg[i] /= (double) studentNum;
			int num = 0;
			for (int k = 0; k < studentNum; k++) {
				if (scores[k] > avg[i]) {
					num++;
				}
			}
			ratio[i] = (double)num / studentNum * 100;
			System.out.printf("%.3f%%\n",ratio[i]);
		}
	}
}
