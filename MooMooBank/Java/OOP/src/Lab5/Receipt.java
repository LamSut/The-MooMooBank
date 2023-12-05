package ThucHanhBuoi5;

import java.util.Scanner;
public class Receipt {
	private Customer cus;
	private String id;
	private MyDate date;
	private String[] product;
	private float[] cost;
	private int[] quantity;
	private int n;
	
	public Receipt() {
		cus = new Customer();
		id = new String();
		date = new MyDate();
		n = 0;
		product = new String[100];
		cost = new float[100];
		quantity = new int[100];
	}
	
	public Receipt(Receipt s) {
		cus = new Customer(s.cus);
		id = new String(s.id);
		date = new MyDate(s.date);
		n = s.n;
		product = new String[s.product.length];
		cost = new float[s.cost.length];
		quantity = new int[s.quantity.length];
		for(int i=0 ; i<n ; i++) {
			product[i] = s.product[i];
			cost[i] = s.cost[i];
			quantity[i] = s.quantity[i];
		}
	}
	
	public void input() {
		System.out.println("--------------INPUT--------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input receipt id: ");
		id = sc.nextLine();
		System.out.println("IS HE/SHE VIP CUSTOMER (1/0)");
		int h = sc.nextInt();
		System.out.println("Input customer infomation");
		if(h==1) cus = new VipCustomer();
		else cus = new Customer();
		cus.input();
		System.out.println("Input date purchase");
		date.Input();
		System.out.println("Input number of products");
		n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n ;i++) {
			System.out.println("Product "+(i+1)+":");
			System.out.print("+ Name: "); product[i]= sc.nextLine();
			System.out.print("+ Cost: "); cost[i] = sc.nextFloat();
			System.out.print("+ Quantity: "); quantity[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
	public void output() {
		System.out.println("______________________RECEIPT______________________");
		System.out.println("Receipt id: "+ id);
		System.out.println("Customer");
		cus.output();
		date.Show();
		System.out.println("______________________PRODUCT______________________");
		System.out.println("no \t\t Name \t\t Quantity \t\t Price \t\t\t Cost");
		float sum = 0;
		for(int i=0; i<n ; i++) {
			if(quantity[i]<10)
			System.out.println((i+1)+". \t\t "+product[i]+" \t\t     "+quantity[i]+" \t\t\t "+cost[i]+" \t\t "+ (cost[i]*quantity[i]));
			else System.out.println((i+1)+". \t\t "+product[i]+" \t\t     "+quantity[i]+" \t\t "+cost[i]+" \t\t "+ (cost[i]*quantity[i]));
			sum += quantity[i] * cost[i];
		}
		sum = sum - sum * cus.getDiscount();
		System.out.println("Total: "+sum);
		
	}
	public String toString() {
		return "Id: " +id +", " + cus.toString() +", "+date.toString();
	}
}