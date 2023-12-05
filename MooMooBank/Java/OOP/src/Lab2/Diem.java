package ThucHanhBuoi2;
import java.util.Scanner;

public class Diem {
	
	private int x,y;
	
	public Diem () {
		x = 0;
		y = 0;
	}
	
	public Diem (int x1, int y) {
		this.x = x1;
		this.y = y;
	}
	
	public Diem (Diem d1) {
		this.x = d1.x;
		this.y = d1.y;
	}
	
	public void nhapDiem () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hoanh do x: ");
		x = sc.nextInt();
		System.out.print("Nhap tung do y: ");
		y = sc.nextInt();
	}
	
	public void hienthi () {
		System.out.println( "(" + x + "," + y + ")" );
	}
	
	public void hienthi (String s) {
		System.out.println(s);
	}
	
	public void doiDiem (int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int giaTriX () {
		return x;
	}
	
	public int giaTriY () {
		return y;
	}
	
	public float khoangCach() {
		float kc = (float) Math.sqrt(x*x + y*y);
		return kc;
	}
	
	public float khoangCach (Diem d) {
		float kc = (float) Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2) );
		return kc;
	}
	
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do A: ");
		A.hienthi();
		
		Diem B = new Diem();
		System.out.println("Nhap toa do B:");
		B.nhapDiem();
		System.out.print("Toa do B: ");
		B.hienthi();
		
		Diem C = new Diem(-B.x, -B.y);
		System.out.print("Toa do C: ");
		C.hienthi();
		
		System.out.println("Khoang cach BO: " + B.khoangCach());
		System.out.println("Khoang cach BA: " + B.khoangCach(A));
		
		System.out.print("Doi diem B voi (3,7): ");
		B.doiDiem(3, 7);
		B.hienthi();
	}
}

