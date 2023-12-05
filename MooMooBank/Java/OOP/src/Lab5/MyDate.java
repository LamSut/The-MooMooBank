package ThucHanhBuoi5;

import java.util.Scanner;

public class MyDate{
	private int d,m,y;
	
	public MyDate () {
		d = 1;
		m = 1;
		y = 1;
	}
	
	public MyDate (int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}
	
	public MyDate (MyDate date) {
		d = date.d;
		m = date.m;
		y = date.y;
	}
	
	public boolean Available () {
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (y % 4 == 0) {
			max[2] = 29;
		}
		
		boolean h = false;
		if (d > 0 && m > 0 && y > 0 && m < 13 && d <= max[m]) {
			h = true;
		}
		return h;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter day: "); d = sc.nextInt();
			System.out.println("Enter month: "); m = sc.nextInt();
			System.out.println("Enter year: "); y = sc.nextInt();
			if (!Available()) {
				System.out.println("Wrong day! Re-enter please!");
			}
		}
		while (!Available());
	}
	
	public void Show() {
		System.out.println("Date: " + d + "-" + m + "-" + y);
	}
	
}
