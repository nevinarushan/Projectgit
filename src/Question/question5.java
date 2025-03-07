package Question;

import java.lang.Math;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner src=new Scanner(System.in);

        int result1=square(multiplier(3,4),multiplier(5,7));
        int result2=square(4,7)+ square(8,3);
        System.out.println("Result 1 is "+result1);
        System.out.println("Result 2 is "+result2);
    }

    public   static int add(int a,int b){
        return a+b;
    }
    public static int multiplier(int a,int b){
        return a*b;
    }
    public static int square(int a,int b){
        int number=(int)Math.pow(a,b);
        return number;
    }

}
