package practice;
// BOJ 4673번
public class Main {
	static boolean[] isNotSelfNumber = new boolean[10001];
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			getDn(i);
		}
		
		for(int i = 1; i < isNotSelfNumber.length; i++) {
			if(!isNotSelfNumber[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void getDn(int n) {
		if(n >= 1 && 10 > n) {
			isNotSelfNumber[n+n] = true;
			
		}else if(n >= 10 && 100 > n) {
			int i = n/10;
			int j = n % 10;
			n = n + i + j;
			isNotSelfNumber[n] = true;
			
		}else if(n >= 100 && 1000 > n) {
			int i = n/100;
			int j = (n / 10) % 10;
			int k = n % 10;
			n = n + i + j + k;
			isNotSelfNumber[n] = true;
		}else if(n >= 1000 && 10000 > n) {
			int i = n / 1000;
			int j = (n / 100) % 10;
			int k = (n / 10) % 10; 
			int m = n % 10;
			n = n + i + j + k + m;
			if(n > 10000) {
				return;
			}
			isNotSelfNumber[n] = true;
		}else {
			return;
		}
	}
}
