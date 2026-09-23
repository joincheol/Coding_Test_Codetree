import java.util.Scanner;
public class Main {
    static int y;
    static int m;
    static int d;

    static boolean checkYear(){
        if(y % 4 == 0){
            if(y % 100 == 0){
                if(y % 400 == 0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }

    static void weather(){
        if(m == 2){
            boolean year = checkYear();
            if(year){
                if(d > 28){
                    System.out.println(-1);
                    return;
                }
            }
            else{
                if(d > 29){
                    System.out.println(-1);
                    return;
                }
            }
        }
        else if(m == 4 | m == 6 | m == 9 | m == 11){
            if(d > 30){
                System.out.println(-1);
                return;
            }
        }
        else{
            if(d > 31){
                System.out.println(-1);
                return;
            }
        }
        if(m >= 3 & m <= 5){
            System.out.println("Spring");
        }
        else if(m >= 6 & m <= 8){
            System.out.println("Summer");
        }
        else if(m >= 9 & m <= 11){
            System.out.println("Fall");
        }
        else{
            System.out.println("Winter");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        // Please write your code here.
        weather();
    }
}