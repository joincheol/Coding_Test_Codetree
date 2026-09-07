import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] count = new int[4];

        for(int i=0; i<3; i++){
            char status = sc.next().charAt(0);
            int temperature = sc.nextInt();

            if(status == 'Y' && temperature >= 37){
                count[0]++;
            }
            else if(status == 'N' && temperature >= 37){
                count[1]++;
            }
            else if(status == 'Y'){
                count[2]++;
            }
            else{
                count[3]++;
            }
        }
        for(int i=0; i<4; i++){
            System.out.print(count[i]+" ");
        }
        if(count[0] >= 2){
            System.out.print("E");
        }
    }
}