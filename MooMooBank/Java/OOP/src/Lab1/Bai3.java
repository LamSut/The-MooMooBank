package ThucHanhBuoi1;

import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			 
			for (int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			int sum = 0;
			for (int i = 0; i<n; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
				sum += arr[i];
			}
			System.out.println("So lon nhat trong chuoi la: " + max);
			System.out.println("Tong cua chuoi la: " + sum);
	}
}
