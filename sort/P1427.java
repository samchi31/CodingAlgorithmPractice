package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class P1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();
		
		char[] charN = strN.toCharArray();
		
		Arrays.sort(charN);
		
		StringBuffer sb = new StringBuffer(new String(charN));
		
		System.out.print(sb.reverse());
		
	}
}
