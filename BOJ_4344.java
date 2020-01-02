import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        double[][] array = new double[test][];
        for(int i = 0; i < test; i++){
            int num = sc.nextInt();
            array[i] = new double[num];
            for(int j = 0; j < num; j++){
                array[i][j] = sc.nextDouble();
            }
        }
        double[] avg = new double[test];
        for(int i = 0; i < array.length; i++){
            double total = 0;
            double cnt = 0;
            for(int j = 0; j < array[i].length; j++){
               total += array[i][j];
            }
            avg[i] = total / (double)array[i].length;
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > avg[i]){
                    cnt++;
                }
            }
            double p = cnt / (double)array[i].length * 100;
            avg[i] = p;
        }
        for(int i = 0; i < avg.length; i++){
            System.out.println(String.format("%.3f",avg[i]) + "%");
        }
    }
}
