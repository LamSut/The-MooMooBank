package ThucHanhBuoi3;

import java.util.Scanner;

public class Gach {
	
	private String id;
	private String color;
	private int soluong, dai, ngang; //soluong = so luong vien gach trong 1 hop
	private long giaHop;
	
	public Gach() {
		id = new String();
		color = new String();
		soluong = dai = ngang = 0;
		giaHop = 0;
	}
	
	public Gach (String id, String color, int soluong, int dai,int ngang, long giaHop) {
		this.id = id;
		this.color = color;
		this.soluong = soluong;
		this.dai = dai;
		this.ngang = ngang;
		this.giaHop = giaHop;
	}
	public Gach (Gach a) {
		this.id = new String(a.id);
		this.color = new String (a.color);
		this.soluong = a.soluong;
		this.dai = a.dai;
		this.ngang = a.ngang;
		this.giaHop = a.giaHop;
	}

	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã gạch: ");
		id = sc.nextLine();
		System.out.println("Nhập màu: ");
		color = sc.nextLine();
		System.out.println("Nhập số lượng viên trong 1 hộp : ");
		soluong = sc.nextInt();
		System.out.println("Nhập chiều dài (cm): ");
		dai = sc.nextInt();
		System.out.println("Nhập chiều ngang (cm)");
		ngang = sc.nextInt();
		System.out.println("Nhập giá 1 hộp: ");
		giaHop = sc.nextLong();
	}
	
	public void HienThi () {
		System.out.println("Loại gạch " + id + " có màu " + color + ", chiều dài " + dai + " (cm) và ngang " + ngang + " (cm)");
		System.out.println("giá của 1 hộp là: " + giaHop + " đồng");
		System.out.println("Có tổng cộng " + soluong + " viên trong 1 hộp");
	}
	
	public long LayGia () {
		return giaHop;
	}
	
	public int LayDai () {
		return dai;
	}
	
	public int LayNgang () {
		return ngang;
	}
	
	//ban le 1 vien
	public float giaBanLe () {
		return (float) ((giaHop / soluong) * (1.2));
	}
	
	public double DienTichMax() {
		return (soluong*dai*ngang);
	}
	
	public int soLuongHop (int D, int N) {
		return (D*N) / soluong;
	}
	
	public double ChiPhi () {
		return (giaHop / (DienTichMax()));
	}
	
}
