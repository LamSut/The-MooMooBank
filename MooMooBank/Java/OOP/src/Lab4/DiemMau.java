package ThucHanhBuoi4;

import java.util.Scanner;
import ThucHanhBuoi2.Diem;

public class DiemMau extends Diem {
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	
	public DiemMau(int x, int y, String color) {
		super(x,y);
		mau = new String(color);
	}
	
	public DiemMau(DiemMau d) {
		super(d);
		this.mau = d.mau;
	}
	
	public void nhapDiem () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem: ");
		super.nhapDiem();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
	}
	
	public void hienthi () {
		super.hienthi();
		System.out.println("Co mau: " + mau);
	}
	
	public void GanMau(String mau) {
		this.mau = new String(mau);
	}
}
