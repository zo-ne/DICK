package ans.ans;

public class Employee extends Earning implements Payable, Invoice {

    private String name;
    private String mobile;

    Employee(String name, String mobile) {
        setName(name);
        setMobile(mobile);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "";
    }
    @Override
    public void getTax() {
        // Implementation for calculating tax
    }
    @Override
    public void getPaymentAmount() {
        // Implementation for getting payment amount
    }
    @Override
    public void earnings() {
        // Implementation for calculating earnings
    }

}
