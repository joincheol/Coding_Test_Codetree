import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] c = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char temp = sc.next().charAt(0);
        int index = -1;

        for(int i=0; i<6; i++){
            if(c[i] == temp){
                index = i;
                System.out.println(index);
                break;
            }
        }
        if(index == -1){
            System.out.println("None");
        }
    }
}