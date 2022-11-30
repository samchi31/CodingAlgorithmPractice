package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P25305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		String[] arrStr = br.readLine().split(" ");
		
//		String[] arr = new String[Integer.parseInt(arrStr[0])];
		String[] grades = br.readLine().split(" ");
		
		Integer[] nGrades = new Integer[grades.length];
		
		for(int i=0;i<grades.length;i++) {
			nGrades[i] = Integer.parseInt(grades[i]);
		}
		Arrays.sort(nGrades, Collections.reverseOrder());
		
		System.out.println(nGrades[Integer.parseInt(arrStr[1])-1]);
	}
}
