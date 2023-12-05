package ThucHanhBuoi2;

import java.util.Scanner;


public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	
	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public void deepCopy(PhanSo a) {
		tuSo = a.tuSo;
		mauSo = a.mauSo;
	}
	public void nhapPhanSo() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap tu so: ");
			tuSo = sc.nextInt();
			System.out.print("Nhap mau so: ");
			mauSo = sc.nextInt();
			
			if (mauSo == 0) {
				System.out.print("Mau so phai khac 0. Hay kiem tra lai");
			}
		}while(mauSo == 0);
		
	}
	
	public void hienThiPhanSo() {
		if (tuSo == 0) 
			System.out.print("0");
		else if (mauSo == 1) 
			System.out.print(tuSo);
		
		else if(mauSo < 0)
			System.out.print("- "+ tuSo + "/" + (-mauSo));
		else 
			System.out.print(tuSo + "/" + mauSo);
		
	}
	
	public void nghichDao() {
		int tmp;
		tmp = tuSo;
		tuSo = mauSo;
		mauSo = tmp;
	}
	
	public PhanSo giaTriNghichDao() {
		PhanSo ps = new PhanSo();
		ps.tuSo = mauSo;
		ps.mauSo = tuSo;
		return ps;
	}
	
	public double giaTriThuc() {
		return (double) tuSo / mauSo;
	}
	
	public boolean lonHon(PhanSo a) {
		return this.giaTriThuc() > a.giaTriThuc();
	}
	
	public PhanSo cong(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.mauSo = this.mauSo * a.mauSo;
		kq.tuSo = this.tuSo * a.mauSo + this.mauSo * a.tuSo;
		return kq;
	}
	
	public PhanSo tru(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.mauSo = this.mauSo * a.mauSo;
		kq.tuSo = this.tuSo * a.mauSo - this.mauSo * a.tuSo;
		return kq;
	}
	
	public PhanSo nhan(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.mauSo = this.mauSo * a.mauSo;
		kq.tuSo = this.tuSo * a.tuSo;
		return kq;
	}
	
	public PhanSo chia(PhanSo a) {
		return this.nhan(a.giaTriNghichDao());
	}
	
	public PhanSo cong(int a) {
		return this.cong(new PhanSo(a,1));
	}
	
	public PhanSo tru(int a) {
		return this.tru(new PhanSo(a,1));
	}
	public PhanSo nhan(int a) {
		return this.nhan(new PhanSo(a,1));
	}
	public PhanSo chia(int a) {
		return this.chia(new PhanSo(a,1));
	}
}
