package practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = findNum(n);
		System.out.println(result);
	}
	
	public static int findNum(int n) {
		if(n < 100) {
			return n;
		}else {
			// 100- 1000
			int cnt = 99;
			for(int i = 100; i <= n; i++) {
				int x = i / 100;
				int y = (i / 10) % 10;
				int z = i % 10;
				if( ((x-y) == (y-z)) || (z-y) == (y-x)) 
				{
					cnt++;
				}
			}
			return cnt;
			}
		}
}

