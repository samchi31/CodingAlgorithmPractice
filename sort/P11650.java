package codepractice.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[][] points = new String[n][2];
		for(int i=0 ;i<n;i++) {
			points[i] = br.readLine().split(" ");
		}
		
	}
}
