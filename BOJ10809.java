package practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int[] result = new int[26];
		for(int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		
		for(int i = 0; i < string.length(); i++) {
			// index
			int s = Integer.valueOf(string.charAt(i)) - 'a';
			if(result[s] == -1) {
				result[s] = i;
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}