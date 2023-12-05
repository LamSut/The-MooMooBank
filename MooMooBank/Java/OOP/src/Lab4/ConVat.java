package ThucHanhBuoi4;

import java.util.*;
public abstract class ConVat {
	private String giong;
	private String mauLong;
	private String CanNang;
	
	public ConVat() {
		giong = new String();
		mauLong = new String();
		CanNang = new String();
	}
	
	public ConVat (String giong, String mauLong, String CanNang) {
		this.giong = new String(giong);
		this.mauLong = new String(mauLong);
		this.CanNang = new String(CanNang);
	}
	
	public ConVat (ConVat a) {
		giong = a.giong;
		mauLong = a.mauLong;
		CanNang = a.CanNang;
	}
	
	public void Nhap () {
		System.out.println("Nhap thong tin con vat:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Giong: ");
		giong = sc.nextLine();
		System.out.println("Mau: ");
		mauLong = sc.nextLine();
		System.out.println("Can nang: ");
		CanNang = sc.nextLine();
	}
	
	public void hienthi() {
		System.out.println(giong + " co long mau " + mauLong + " nang " + CanNang);
	}
	
	public abstract void Keu();
}
