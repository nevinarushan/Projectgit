package Question3;

public class employee {
    private String employeename;
    private double salary;
    private int rating;
    private int ID;
    private double totalSlary;
    private double bonus;

    public employee() {
        employeename = "";
        salary = 0.0;
        rating = 0;
        ID = 0;
        totalSlary = 0.0;
        bonus = 0.0;
    }


    public void setName(String name) {
        this.employeename = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setrating(int rating) {
        this.rating = rating;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public void calculateBonus() {
        switch (this.rating) {
            case 1:
                bonus=salary*0.00;
                break;
            case 2:
                bonus=salary*0.05;
                break;
            case 3:
                bonus=salary*0.10;
                break;
            case 4:
                bonus=salary*0.15;
                break;
            case 5:
                bonus=salary*0.20;
                break;

        }
    }


    public void totalsalarycalculate(){
         this.totalSlary = this.bonus + this.salary;
    }


    public void displayDetails() {
        System.out.println("Employee details");
        System.out.println("Employee ID: "+this.ID);
        System.out.println("Namee: "+this.employeename);
        System.out.println("Basic Salary: "+this.salary);
        System.out.println("Perfomrace rating: "+this.rating);
        System.out.println("Bonus amount: "+this.bonus);
        System.out.println("Total salary: "+ String.format("%.2f", this.totalSlary));
    }


}
