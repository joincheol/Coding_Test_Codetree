import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] block = new int[N+1];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for(int j=A; j<=B; j++){
                block[j]++;
            }
        }
        // Please write your code here.
        int maxVal = block[0];
        for(int i=0; i<N; i++){
            if(maxVal < block[i]){
                maxVal = block[i];
            }
        }
        System.out.println(maxVal);
    }
}