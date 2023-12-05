package ThucHanhBuoi2;
import java.util.Scanner;
public class Date {
	
	private int d,m,y;
	
	public Date() {
		d = 1;
		m = 1;
		y = 0;
	}
	
	public Date (int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}
	
	public boolean hople () {
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (y % 4 == 0) {
			max[2] = 29;
		}
		
		boolean h = false;
		if (d > 0 && m > 0 && y > 0 && m < 13 && d <= max[m]) {
			h = true;
		}
		return h;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap ngay: ");
			d = sc.nextInt();
			System.out.println("Nhap thang: ");
			m = sc.nextInt();
			System.out.println("Nhap nam: ");
			y = sc.nextInt();
			if (!hople()) {
				System.out.println("Nhap lai!");
			}
		}
		while (!hople());
		
	}
	
	public void hienThi () {
		System.out.println(d + "/" + m + "/" + y);
	}
	
	public Date ngayHomSau () {
		Date kq = new Date(d,m,y);
		kq.d ++;
		if (! kq.hople()) {
			kq.d = 1;
			kq.m ++;
			if (!kq.hople()) {
				kq.m = 1;
				kq.y ++;
			}
		}
		return kq;
	}
	
	public Date congNgay (int n) {
		Date kq = new Date(d,m,y);
		for (int i = 0; i<n; i++) {
			kq = kq.ngayHomSau();
		}
		return kq;
	}
	
	public static void main(String[] args) {
		Date d1 = new Date (12,9,2003);
		d1.hienThi();
		
		Date d2 = new Date();
		d2.nhap();
		d2.hienThi();
		d2 = d2.congNgay(3);
		d2.hienThi();
	}
}
