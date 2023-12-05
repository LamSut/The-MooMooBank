package ThucHanhBuoi3;

import java.util.Scanner;
import ThucHanhBuoi2.Date;

public class SinhVien {
	
	private String MaSV;
	private String HoTen;
	private Date ngaysinh;
	private int soluongHP;
	private String[] tenHP;
	private String[] diemHP;
	private int max = 55;
	
	public SinhVien () {
		MaSV = new String();
		HoTen = new String();
		ngaysinh = new Date();
		soluongHP = 0;
		tenHP = new String[max];
		diemHP = new String[max];
	}
	
	public SinhVien (SinhVien a) {
		MaSV = new String(a.MaSV);
		HoTen = new String(a.HoTen);
		ngaysinh = a.ngaysinh;
		soluongHP = a.soluongHP;
		tenHP = new String[a.tenHP.length];
		diemHP = new String[a.diemHP.length];
		for (int i = 0; i < a.soluongHP; i++) {
			tenHP[i] = new String(a.tenHP[i]);
			diemHP[i] = new String(a.diemHP[i]);
		}
	}
	
	public String layTenSV() {
		return HoTen;
	}
	public void Nhap () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap thong tin SV");
		System.out.println("Ten SV: ");
		HoTen = sc.nextLine();
		System.out.println("MSSV: ");
		MaSV = sc.nextLine();
		System.out.println("Ngay sinh: ");
		ngaysinh.nhap();
		System.out.println("Nhap so luong HP: ");
		soluongHP = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i<soluongHP; i++) {
			System.out.println("Nhap ten HP:");
			tenHP[i] = sc.nextLine();
			System.out.println("Nhap diem HP:");
			diemHP[i] = sc.nextLine();
		}
	}
	
	public void In () {
		System.out.println(HoTen + " " + MaSV);
		ngaysinh.hienThi();
		for (int i = 0; i <soluongHP; i++) {
			System.out.println("Ten HP: " + tenHP[i]);
			System.out.println("Diem HP: " + diemHP[i]);
		}
	}
	
	public String toString () {
		return "ten SV " + HoTen + "MSVV " + MaSV + "sinh ngay " + ngaysinh.toString();
	}
	
	public float DTB () {
		float sum = 0;
		for (int i = 0; i<soluongHP; i++) {
			if (diemHP[i].equals("A") || diemHP[i].equals("a")) {
				sum += 4;
			}
			else if (diemHP[i].equals("B+") || diemHP[i].equals("b+")) {
				sum += 3.5;
			}
			else if (diemHP[i].equals("B") || diemHP[i].equals("b")) {
				sum += 3;
			}
			else if (diemHP[i].equals("C+") || diemHP[i].equals("c+")) {
				sum += 2.5;
			}
			else if (diemHP[i].equals("C") || diemHP[i].equals("c")) {
				sum += 2;
			}
			else if (diemHP[i].equals("D+") || diemHP[i].equals("d+")) {
				sum += 1.5;
			}
			else if (diemHP[i].equals("D") || diemHP[i].equals("d")) {
				sum += 1;
			}
			else if (diemHP[i].equals("F") || diemHP[i].equals("f")) {
				sum += 0;
			}
		}
		return (sum/soluongHP);
	}
	
	public void DKyHP () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dang Ky them 1 HP");
		if (soluongHP == max) {
			System.out.println("Da dang ky du HP cho phep");
		}
		else {
			System.out.println("Nhap ten HP:");
			tenHP[soluongHP] = sc.nextLine();
//			System.out.println("Nhap diem HP:");
//			diemHP[soluongHP] = sc.nextLine();
			soluongHP++;
			System.out.println("Da dang ky thanh cong");
		}
	}
	
	public void XoaHP () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon HP can xoa");
		String HPxoa = sc.nextLine();
		int tmp = 56;
		for (int i = 0; i<soluongHP; i++) {
			if (tenHP[i].equals(HPxoa)) {
				tmp = i;
				break;
			}
		}
		
		if (tmp == 56) {
			System.out.println("Khong tim thay HP");
		}
		else {
			for (int i = tmp; i<soluongHP; i++) {
				tenHP[i] = tenHP[i+1];
				diemHP[i] = diemHP[i+1];
			}
			soluongHP--;
		}
	}
}
