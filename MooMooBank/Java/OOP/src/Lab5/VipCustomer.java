package ThucHanhBuoi5;
import java.util.*;
public class VipCustomer extends Customer {
	private float discount;
	private MyDate date;
	
	public VipCustomer () {
		super();
		discount = 0;
		date = new MyDate();
	}
	
	public VipCustomer (Customer a, float dis, MyDate d) {
		super(a);
		discount = dis;
		date = new MyDate(d);
	}
	
	public VipCustomer (VipCustomer a) {
		super((Customer) a);
		discount = a.discount;
		date = new MyDate(a.date);
	}
	
	public void Input_vip() {
		Scanner sc = new Scanner (System.in);
		System.out.println("VIP Customer:");
		super.input();
		System.out.println("Enter discount amount: "); discount = sc.nextFloat();
		System.out.println("Enter day becoming VIP: "); date.Input();
	}
	
	public void Show_vip() {
		super.output();
		System.out.println("discount: " + discount + " has become VIP since ");
		date.Show();
	}
	
	public float getDiscount() {
		return discount;
	}
}
