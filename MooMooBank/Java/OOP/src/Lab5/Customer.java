package ThucHanhBuoi5;

import java.util.*;
public class Customer {
	private String name;
	private String phone;
	private String address;
	private String gender;
	private float discount;
	
	public Customer() {
		name = new String();
		phone = new String();
		address = new String();
		gender = new String();
	}
	
	public Customer(String n, String p, String a, String g) {
		name = new String(n);
		phone = new String(p);
		address = new String(a);
		gender = new String(g);
	}
	
	public Customer(Customer a) {
		name = new String(a.name);
		phone = new String(a.phone);
		address = new String(a.address);
		gender = new String(a.gender);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of customer: "); name = sc.nextLine();
		System.out.println("Enter gender of customer: "); gender = sc.nextLine();
		System.out.println("Enter phone number of customer: "); phone = sc.nextLine();
		System.out.println("Enter address of customer: "); address = sc.nextLine();
	}
	
	public void output() {
		System.out.println("Customer " + name + ", " + gender + ", has phone number: " + phone + ", lives on " + address);
	}
	
	public float getDiscount() {
		return 0;
	}
}
