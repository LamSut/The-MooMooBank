package ThucHanhBuoi1;
import java.util.Scanner;
public class Bai5 {
	public static void PTB1 (double b, double c) {
		System.out.println("Nghiem cua phuong trinh la: " + (-c/b));
	}
	public static void PTB2 (double a, double b, double c) {
		double delta = (b*b) - (4*a*c);
		if (delta < 0) {
			System.out.println("PT vo nghiem");
		}
		else if (delta == 0) {
			System.out.println("PT co 1 nghiem la: " + (-b/(2*a)));
		}
		else {
			System.out.println("Nghiem cua PT la: " + ((-b + Math.sqrt(delta)) / (2*a)));
			System.out.println("Nghiem cua PT la: " + ((-b - Math.sqrt(delta)) / (2*a)));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if (a == 0) {
			Bai5 ptb1 = new Bai5();
			ptb1.PTB1(b, c);
		}
		else {
			Bai5 ptb2 = new Bai5();
			ptb2.PTB2(a, b, c);
		}
	}
}
