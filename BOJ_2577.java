import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = A * B * C;
        String str = Integer.toString(max);
        int[] num = new int[10];
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)) {
                case '0':
                    num[0] = num[0] + 1;
                    break;
                case '1':
                    num[1] = num[1] + 1;
                    break;
                case '2':
                    num[2] = num[2] + 1;
                    break;
                case '3':
                    num[3] = num[3] + 1;
                    break;
                case '4':
                    num[4] = num[4] + 1;
                    break;
                case '5':
                    num[5] = num[5] + 1;
                    break;
                case '6':
                    num[6] = num[6] + 1;
                    break;
                case '7':
                    num[7] = num[7] + 1;
                    break;
                case '8':
                    num[8] = num[8] + 1;
                    break;
                case '9':
                    num[9] = num[9] + 1;
                    break;
             }
        }
        for(int i = 0 ; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
