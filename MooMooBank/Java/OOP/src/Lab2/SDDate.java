package ThucHanhBuoi2;

import java.util.Scanner;
public class SDDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date (12,9,2003);
		d1.hienThi();
		
		Date d2 = new Date();
		d2.nhap();
		d2.hienThi();
		
		System.out.println("Nhap so ngay cong them: ");
		int n = sc.nextInt();
		d2 = d2.congNgay(n);
		System.out.println("Ngay da duoc cong la: ");
		d2.hienThi();
	}
}
