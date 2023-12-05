package ThucHanhBuoi3;

import java.util.Scanner;
import ThucHanhBuoi2.Diem;
public class DoanThang {
	
	private Diem d1;
	private Diem d2;
	
	public DoanThang () {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang (Diem d1, Diem d2) {
		this.d1 = new Diem(d1);
		this.d2 = new Diem(d2);
	}
	
	public DoanThang (int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public void Nhap () {
		Scanner sc = new Scanner(System.in);
		d1.nhapDiem();
		d2.nhapDiem();
	}
	
	public void HienThi() {
		d1.hienthi();
		d2.hienthi();
	}
	
	public void doiDiem (int dx, int dy) {
		d1.setX(d1.giaTriX() + dx);
		d1.setY(d1.giaTriY() + dy);
		d2.setX(d2.giaTriX() + dx);
		d2.setY(d2.giaTriY() + dy);
	}
	
	public float khoangcach () {
		return d1.khoangCach(d2);
	}
}
