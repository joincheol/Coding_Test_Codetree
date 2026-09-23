import java.util.Scanner;
public class Main {
    static int m;
    static int d;
    static boolean valid1(){
        if(d > 28){
            return false;
        }
        return true;
    }
    static boolean valid2(){
        if(d > 30){
            return false;
        }
        return true;
    }
    static boolean valid3(){
        if(d > 31){
            return false;
        }
        return true;
    }

    static boolean check(){
        if(m > 12){
            return false;
        }
        if(d > 31){
            return false;
        }
        // 2월 - 28일
        // 4, 6, 9, 11 - 30일
        if(m == 2){
            return valid1();
        }
        else if(m == 4 | m == 6 | m == 9 | m == 11){
            return valid2();
        }
        else{
            return valid3();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();
        // Please write your code here.
        if(check()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}