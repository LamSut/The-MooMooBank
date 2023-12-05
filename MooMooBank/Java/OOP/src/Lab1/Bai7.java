package ThucHanhBuoi1;
import java.util.Scanner;
public class Bai7 {
	public static void Ten (String a) {
		System.out.println(a.substring(a.lastIndexOf(" ") + 1));
	}
	public static void Ho (String a) {
		System.out.println(a.substring(0, a.indexOf(" ")));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String hoten = sc.nextLine();
		Bai7 lname = new Bai7();
		Bai7 fname = new Bai7();
		lname.Ten(hoten);
		fname.Ho(hoten);
	}
}
