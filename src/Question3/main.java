package Question3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        employee emp=new employee();
        Scanner src =new Scanner(System.in);

        System.out.println("Enter your name");
        String name=src.nextLine();
        emp.setName(name);

        System.out.println("Enter your ID");
        int Id=src.nextInt();
        emp.setID(Id);

        System.out.println("Enter your salary");
        double salary=src.nextDouble();
        emp.setSalary(salary);

        int rating=0;
        do{
            System.out.println("Enter your rating (Enter number between 1 to 5)");
            rating=src.nextInt();

        }while (rating < 1 || rating > 5);
        emp.setrating(rating);


        emp.calculateBonus();
        emp.totalsalarycalculate();
        System.out.println("");
        emp.displayDetails();

    }

}
