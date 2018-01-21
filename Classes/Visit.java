import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(){}

    public Visit(Customer customer, Date date, double serviceExpense, double productExpense) {
        this.customer = customer;
        this.date = date;
        this.serviceExpense = serviceExpense;
        this.productExpense = productExpense;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        double serviceRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double service = discount(serviceExpense,serviceRate);
        double productRate = DiscountRate.getProductDiscountRate(customer.getMemberType());

        double product = discount(productExpense,productRate);
        return service + product;
    }

    private double discount(double value, double rate){
        int percentage = (int)rate * 100;
        double p = (percentage/100.0) * value;
        return value - p;
    }
}
