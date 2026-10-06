import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);
        int maxVal = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int temp = nums[i] + nums[2*n - i - 1];
            if(maxVal < temp){
                maxVal = temp;
            }
        }
        System.out.println(maxVal);
    }
}