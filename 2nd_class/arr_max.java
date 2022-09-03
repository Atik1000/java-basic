

import java.util.Scanner;
class array_max {
    //create method
    public static int Maximum(int[] arr){
        //create variable
        int max=arr[0];
        //loop
        for (int i = 0; i < arr.length; i++) {
            //check condition
            if (arr[i]>max){
                //assign value
                max=arr[i];
            }
        }
        //return value
        return max;
    }
    //main method
    public static void main(String[] args) {
        //create object
        Scanner sc = new Scanner(System.in);
        //create variable
        int n;
        //input
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        //create array
        int[] arr = new int[n];
        //input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //print
        System.out.println("Summation of all even numbers of an array is: "+Maximum(arr));
    }
}