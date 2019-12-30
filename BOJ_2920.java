
import java.util.Scanner;
// 출처: https://github.com/bellaah/BOJ-algorithm/commit/dc5158f9430ff5188a5102d78fc08bd87a1dd229
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean ascending=false;
        boolean descending=false;
        for(int i = 0; i < arr.length-2; i++){
            if(arr[i] < arr[i+1] && arr[i+1] < arr[i+2]){
                ascending = true;
            }else if(arr[i] > arr[i+1] && arr[i+1] > arr[i+2]){
                descending = true;
            }else{
                ascending = false;
                descending = false;
                break;
            }
        }
        if(ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}