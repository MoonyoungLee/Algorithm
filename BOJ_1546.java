import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        for(int i = 0; i < N; i++){
            score[i] = sc.nextDouble();
        }
        double max = score[0];
        for(int i = 1 ; i < N; i++){
            if(max <= score[i]){
                max = score[i];
            }
        }
        double total = 0;
        for(int i = 0; i < N; i++){
            score[i] = (score[i] / max) * 100;
            total+= score[i];
        }
        System.out.println((double)total/N);
    }
}
