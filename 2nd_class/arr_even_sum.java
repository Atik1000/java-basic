//Find the summation of all even numbers of an array using function.
//        Also find the summation of all odd numbers of an array using another function.

import java.util.Scanner;
class array_summar {
    //create method
    public static int Maximum(int[] arr){
        //create variable
        float sum=0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            //check condition
            if (arr[i]%2==0){
                //assign value
                sum+=arr[i];
            }
        }
        //return value
        return (int) sum;
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