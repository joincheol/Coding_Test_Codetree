import java.util.Scanner;

public class Main {
    static int r = 0;
    static int c = 0;
    static int currDir = 3;
    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dirs = sc.next();
        // Please write your code here.
        char[] order = dirs.toCharArray();

        for(int i=0; i<dirs.length(); i++){
            if(order[i] == 'L'){
                currDir = (currDir -1 + 4) % 4;
            }
            else if(order[i] == 'R'){
                currDir = (currDir + 1) % 4;
            }
            else{
                r += dr[currDir];
                c += dc[currDir];
            }
        }
        System.out.println(c+" "+r);
    }
}