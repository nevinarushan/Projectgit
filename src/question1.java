

//import javax.swing.plaf.metal.MetalSliderUI;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner src=new Scanner(System.in);

        System.out.print("Enter first number");
        int A=src.nextInt();
        System.out.print("Enter second number");
        int B=src.nextInt();
        System.out.print("Enter third number");
        int C=src.nextInt();

        int highest=0;

        if(A>B){
            highest=A;
            if(A>C){
                highest=A;
            }
            else {
                highest=C;
            }
        }
        else {
            if(B>C){
                highest=B;
            }
            else {
                highest=C;
            }
        }


        System.out.println("The highest number is "+highest);
    }
}