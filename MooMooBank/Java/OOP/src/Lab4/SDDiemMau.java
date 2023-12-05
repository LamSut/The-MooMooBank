package ThucHanhBuoi4;

import java.util.Scanner;

import ThucHanhBuoi2.Diem;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10,"trang");
		A.hienthi();
		
		DiemMau B = new DiemMau();
		B.nhapDiem();
		B.hienthi();
		B.doiDiem(10, 8);
		B.hienthi();
		B.GanMau("vang");
		B.hienthi();
	}
}
