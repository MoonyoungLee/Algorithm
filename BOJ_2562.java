import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0;
        while(i < 9){
            arr[i] = sc.nextInt();
            i++;
        }
        int max = arr[0];
        int index = 0;
        for(int j = 0; j < arr.length-1; j++){
            //   System.out.println(arr[j]);
            if(max <= arr[j]){
                max= arr[j];
                index = j+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}