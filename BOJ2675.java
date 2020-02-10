package practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i = 0; i < test; i++) {
			int c = sc.nextInt();
			String str = sc.next();
			for (int k = 0; k < str.length(); k++) {
				char a = str.charAt(k);
				for (int j = 0; j < c; j++) {
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}