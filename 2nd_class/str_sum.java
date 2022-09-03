// java string input and find length

import java.util.Scanner;
public class str_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(len);
        if(len%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}