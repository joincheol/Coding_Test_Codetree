import java.util.Scanner;
import java.util.Arrays;

class Users{
    String name, address, region;
    public Users(){
        String name = "";
        String address = "";
        String region = "";
    }
    
    public Users(String name, String address, String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] address = new String[n];
        String[] region = new String[n];

        Users[] user = new Users[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            address[i] = sc.next();
            region[i] = sc.next();

            user[i] = new Users();
            user[i].name = name[i];
            user[i].address = address[i];
            user[i].region = region[i];
        }

        // Please write your code here.
        Arrays.sort(name);
        for(int i=0; i<n; i++){
            if(name[n-1] == user[i].name){
                System.out.println("name "+user[i].name);
                System.out.println("addr "+user[i].address);
                System.out.println("city "+user[i].region);
            }
        }
    }
}
