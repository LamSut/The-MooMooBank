package ThucHanhBuoi2;

import java.util.Scanner;

public class SDPhanSo {

		public static void main(String []args) {
				PhanSo a = new PhanSo(3, 7);
				PhanSo b = new PhanSo(4, 9);
				PhanSo x = new PhanSo();
				PhanSo y = new PhanSo();
				System.out.println("Nhap x:");
				x.nhapPhanSo();
				System.out.println("Nhap y:");
				y.nhapPhanSo();
				System.out.print("Gia tri nghich dao cua x la: ");
				x.giaTriNghichDao().hienThiPhanSo();
				System.out.print("\nx + y =");
				x.cong(y).hienThiPhanSo();
				
				int n;
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Nhap vao n: ");
				n = sc.nextInt();
				
				PhanSo ps[] = new PhanSo[n];
				PhanSo sum = new PhanSo();
				for(int i=0; i<n; i++) {
					ps[i] = new PhanSo();
					System.out.println("Nhap vao phan so thu "+ (i+1) + ":");
					ps[i].nhapPhanSo();
					sum = sum.cong(ps[i]);
				}
				System.out.print("Tong cua phan so la: ");
				sum.hienThiPhanSo();
				
				PhanSo max = new PhanSo(ps[0].getTuSo(), ps[0].getMauSo());
				for (int i=1 ; i<n; i++) {
					if (ps[1].lonHon(max)) {
						max.setTuSo(ps[i].getTuSo());
						max.setMauSo(ps[i].getMauSo());
					}
				}
				
				System.out.print("\n Phan so lon nhat la: ");
				max.hienThiPhanSo();
				
				PhanSo tmp = new PhanSo();
				for(int i=0; i<n; i++) {
					for(int j=i+1;j<n;j++) {
						if(ps[i].lonHon(ps[j])) {
							tmp.deepCopy(ps[i]);
							ps[i].deepCopy(ps[j]);
							ps[j].deepCopy(tmp);
						}
					}
				}
				System.out.print("\n Day phan so co thu tu la: ");
				for(int i=0; i<n; i++) {
					ps[i].hienThiPhanSo();
					System.out.print(" ");
				}
			}
}
