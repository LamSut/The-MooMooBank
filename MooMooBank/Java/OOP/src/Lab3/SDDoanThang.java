package ThucHanhBuoi3;

import ThucHanhBuoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem a = new Diem (2,5);
		Diem b = new Diem (20,35);
		DoanThang ab = new DoanThang(a,b);
		ab.HienThi();
		ab.doiDiem(5,3);
		ab.HienThi();
		
		System.out.println("Nhap toa do doan thang CD:");
		DoanThang cd = new DoanThang();
		cd.Nhap();
		cd.HienThi();
		System.out.println("Khoang cach CD la: " + cd.khoangcach());
	}
}
