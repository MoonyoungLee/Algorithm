package practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String string = sc.next();
		int result  = 0;
		for(int i = 0; i < cnt; i++) {
			result += Integer.valueOf(string.charAt(i)) - '0';
		}
		System.out.println(result);
	}
}