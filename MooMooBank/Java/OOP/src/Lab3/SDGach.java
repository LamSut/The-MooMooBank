package ThucHanhBuoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số loại gạch: ");
		int n = sc.nextInt();
		Gach a[] = new Gach [50];
		double MinPrice = 100000;
		int tmp = 0;
		for (int i = 1; i<=n; i++) {
			System.out.println("Nhập tên gạch thứ " + i);
			a[i] = new Gach();
			a[i].Nhap();
			a[i].HienThi();
			if (a[i].ChiPhi() < MinPrice) {
				MinPrice = a[i].ChiPhi();
				tmp = i;
			}
			a[i].soLuongHop(2000, 500);
			int soHop = a[i].soLuongHop(2000, 500);
			System.out.println("Cần " + soHop + " hộp để lót 20m x 5m");
			long chiphi = (a[i].LayGia() * soHop);
			System.out.println("Chi phí mua gạch loại " + i + " để lót 20m x 5m là: " + chiphi + " đồng");
		}
		System.out.println("Gạch loại " + tmp + " có chi phí thấp nhất là: " + MinPrice + " đồng/cm vuông");
		
	}
}
