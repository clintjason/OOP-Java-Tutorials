import java.util.Date;

public class TestVisit {
    public static void main(String[] args){
        Customer c = new Customer("bill",true,"Gold");
        Visit v = new Visit(c,new Date(),100,400);
        System.out.println("Total expense: " + v.getTotalExpense());
    }
}

