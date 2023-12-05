package ThucHanhBuoi1;
import java.util.Scanner;
public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int temp = 0;
		for (int i = 0; i<n; i++) {
			if (arr[i] == x) {
				temp ++;
			}
		}
		System.out.println("So lan xuat hien cua " + x + " la: " + temp);
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<i; j++) {
				if (arr[j] > arr[i]) {
					int temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
