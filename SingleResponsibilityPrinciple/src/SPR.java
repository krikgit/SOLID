import java.time.LocalDate;

class  Employee{
    private long employeeId;
    private String employeeName;
    private String dept;
    private LocalDate doj;

    public Employee() {
    }
//As below two method is subject to change so its violets the SPR Rule
    //So moving them to different class
    /*public boolean isPromotionDue(){
        //logic
    }
    public BigDecimal calIncomeTax(){
        //logic
    }*/

    //getter & setter - constructors
}

public class SPR {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle");
        System.out.println("---------------------------------");

        System.out.println("Every class is having single responsibility to execute");

        Finance finance = new Finance();
        System.out.println("Tax:"+finance.calIncomeTax(new Employee()));

        HRPromotions hrPromotions = new HRPromotions();
        System.out.println("Promotion:"+hrPromotions.isPromotionDue(new Employee()));


    }
}