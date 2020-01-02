import java.util.Scanner;
// 참고: https://m.blog.naver.com/PostView.nhn?blogId=pgh7092&logNo=221121033017&proxyReferer=https%3A%2F%2Fwww.google.com%2F
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] score = new String[test];
        int[] result = new int[test];
        for(int i = 0; i < score.length;i++){
            score[i] = sc.next();
            int temp = 0;
            for(int j = 0; j < score[i].length(); j++){
                if(score[i].charAt(j) == 'O'){
                    temp++;
                    result[i] += temp;
                }else{
                  temp = 0;
                }
            }
        }
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
