package ThucHanhBuoi4;

import ThucHanhBuoi3.SinhVien;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan;
	private String matkhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT a) {
		super(a);
		this.taikhoan = new String(a.taikhoan);
		this.matkhau = new String(a.matkhau);
		this.email = new String(a.email);
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.println("Nhap email: "); email = sc.nextLine();
		System.out.println("Nhap tai khoan ELCIT: "); taikhoan = sc.nextLine();
		System.out.println("Nhap mat khau: "); matkhau = sc.nextLine();
	}
	
	public void In() {
		super.In();
		System.out.println("Email: " + email);
		System.out.println("Ten dang nhap: " + taikhoan);
		System.out.println("Mat khau: " + matkhau);
	}
	
	public String toString() {
		return super.toString() + " email ELCIT" + email + " tai khoan dang nhap: " + taikhoan + " mat khau: " + matkhau;
	}
	
	public void doiMatKhau(String newpass) {
		matkhau = new String(newpass);
	}
	
	public String getEmail() {
		return email;
	}
}
