import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<q; i++){
            int select = sc.nextInt();
            if(select == 1){
                int index = sc.nextInt();
                System.out.println(arr[index-1]);
            }
            else if(select == 2){
                int b = sc.nextInt();
                int find = -1;
                for(int j=0; j<n; j++){
                    if(arr[j] == b){
                        System.out.println(j+1);
                        find = 1;
                        break;
                    }
                }
                if(find != 1){
                    System.out.println(0);
                }
            }
            else if(select == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=s-1; j<e; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}