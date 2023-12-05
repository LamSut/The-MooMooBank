package ThucHanhBuoi1;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(a+b);
		int n,m;
		m = n = Integer.MAX_VALUE;
		do {
			String a = sc.next();
			String b = sc.next();
			try {
				n = Integer.parseInt(a);
				m = Integer.parseInt(b);
				System.out.println(n+m);
			} catch (NumberFormatException e) {
				System.out.println("Ngu");
				System.out.println("Nhap lai di:");
				m = n = Integer.MAX_VALUE;
			}
		} while (m==Integer.MAX_VALUE || n==Integer.MAX_VALUE);
		
		
		
		
	}
}
