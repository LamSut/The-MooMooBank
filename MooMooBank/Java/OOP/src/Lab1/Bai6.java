package ThucHanhBuoi1;
import java.util.Scanner;
public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i ;
		int [] arr = new int [50];
		for (i = 0; n > 0; i++) {
			arr[i] = n % 2;
			n = n/2;
		}
		for (i = i-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
