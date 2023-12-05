package ThucHanhBuoi4;

import java.util.Scanner;
public class SinhVienCNTTApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for (int i = 0; i<n; i++) {
			ds[i] = new SinhVienCNTT();
			ds[i].Nhap();
		}
		
		for (int i = 0; i<n; i++) {
			ds[i].In();
			System.out.println("");
		}

		System.out.println("Nhap vao 1 email: ");
		String timkiem =sc.next();
		for(int i = 0; i<n; i++) {
			if (ds[i].getEmail().equals(timkiem)) {
				ds[i].In();
				break;
			}
		}
	}
}
