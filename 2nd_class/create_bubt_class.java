// . Create a class BUBT with a method showAll(): shows the total number of students. 
// Implement this problem in another class containing main method.
import java.util.Scanner;
class BUBT {
    //create method
    public static void showAll(int[] arr){
        //create variable
        int sum=0;
        //loop
        for (int i = 0; i < arr.length; i++) {
            //assign value
            sum+=arr[i];
        }
        //print
        System.out.println("Total number of students: "+sum);
    }
}
// Implement this problem in another class containing main method.
class Main {
    //main method
    public static void main(String[] args) {
        //create object
        Scanner sc = new Scanner(System.in);
        //create variable
        int n;
        //input
        System.out.println("Enter the number of departments: ");
        n = sc.nextInt();
        //create array
        int[] arr = new int[n];
        //input
        System.out.println("Enter the number of students: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //call method
        BUBT.showAll(arr);
    }
}