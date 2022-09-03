import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("summation of "+a +" and "+b+" is: "+Sum(a,b));
        System.out.println("Different of "+a +" and "+b+" is: "+Dif(a,b));
        System.out.println("Multiplication of "+a +" and "+b+" is: "+Mul(a,b));
        System.out.println("Division of "+a +" and "+b+" is: "+Div(a,b));
        System.out.println(String.format("%.2f", Div(a,b)));

    }
    public static int Sum(int x,int y){
        return x+y;
    }
    public static int Dif(int x,int y){
        return x-y;
    }
    public static int Mul(int x,int y){
        return x*y;
    }
    public static float Div(int x,int y){
        return x/y;
//        set 2 digit Precision

    }
}