package resba;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sba {
	public static void main(String argvs[]) {
		int num,num1,num2;
		Scanner scc = new Scanner(System.in);
		ArrayList<Customer> al = new ArrayList<Customer>();
		
        al.add(new Customer(1, "Sname",26,5000));
        al.add(new Customer(2, "Dname",21,300));
        al.add(new Customer(3, "Aname",25,600));
        al.add(new Customer(4, "Xname",34,800));
        al.add(new Customer(5, "Anamee",78,6000));
        al.add(new Customer(6, "Kname",18,1000));
        al.add(new Customer(7, "Zname",50,5000));
        al.add(new Customer(8, "Ankit",23,50000));
        al.add(new Customer(9, "Cname",19,2400));
        al.add(new Customer(10, "Rname",24,1900));
		
			
			System.out.println("Press 1 to see all Customer data or Press 2 to edit purchase amount of a Customer or 3 to exit.");
			num = scc.nextInt();
			switch (num)
			{
			case 1:
				Collections.sort(al);
				for(Customer cust : al){
					System.out.println(cust.customerId + "  "
		                    + cust.customerName+"  "+ cust.age+"  "+ cust.purchaseamount);
		        }
				break;
			case 2:
				System.out.println("Enter cust id:");
				num1 = scc.nextInt();
				for(Customer cust : al){
		            if(cust.customerId==num1) {
		            	System.out.println("Enter new purchase amount:");
		            	num2=scc.nextInt();
		            	cust.purchaseamount=num2;
		            	System.out.println(cust.customerId + "  "
			                    + cust.customerName+"  "+ cust.age+"  "+ cust.purchaseamount);
		     
		            }
		        }
				break;
			case 3: 
				System.exit(0);
				default:
					System.out.println("enter correct number");
				
			
		}
		
	} }
