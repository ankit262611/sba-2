package resba;
public class Customer implements Comparable<Customer> {

    int customerId;
    String customerName;
    int age;
    int purchaseamount;
    public Customer(int customerId, String customerName, int age, int purchaseamount) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.age=age;
		this.purchaseamount=purchaseamount;
	}
    public void setData1(int purchaseamount)
	{
		this.purchaseamount=purchaseamount;
	}
	public int compareTo(Customer o) {
        return this.customerName.compareTo(o.customerName);
    }
}
