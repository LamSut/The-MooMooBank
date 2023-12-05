package ThucHanhBuoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//SV a
		SinhVien a = new SinhVien();
		a.Nhap();
		a.DKyHP();
		a.In();
		
		//ds sinh vien
		System.out.println("Nhap so luong SV: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		
		for (int i = 0; i<n; i++) {
			ds[i]= new SinhVien();
			ds[i].Nhap();
		}
		for (int i = 0; i<n; i++) {
			ds[i].In();
			System.out.println("");
		}
		
		//SV bi canh bao hoc vu + SV co DTB cao nhat
		double MaxDTB = ds[0].DTB();
		int tmp = 0;
		for (int i = 0; i<n; i++) {
			if (ds[i].DTB() > MaxDTB) {
				MaxDTB = ds[i].DTB();
				tmp = i;
			}
			if (ds[i].DTB() <= 1) {
				System.out.println("SV " + ds[i].layTenSV() + " bi canh bao hoc vu");
			}
		}
		System.out.println("SV " + ds[tmp].layTenSV() + " co DTB cao nhat " + MaxDTB);

	}
}
