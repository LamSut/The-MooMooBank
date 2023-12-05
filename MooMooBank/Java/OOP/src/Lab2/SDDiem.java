package ThucHanhBuoi2;
import java.util.Scanner;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do A: ");
		A.hienthi();
		
		Diem B = new Diem();
		System.out.println("Nhap toa do B:");
		B.nhapDiem();
		System.out.print("Toa do B: ");
		B.hienthi();
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("Toa do C: ");
		C.hienthi();
		
		System.out.println("Khoang cach BO: " + B.khoangCach());
		System.out.println("Khoang cach BA: " + B.khoangCach(A));
		
		System.out.print("Doi diem B voi (3,7): ");
		B.doiDiem(3, 7);
		B.hienthi();
	}
}
