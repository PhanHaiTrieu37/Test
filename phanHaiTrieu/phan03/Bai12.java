package phanHaiTrieu.phan03;

import java.util.Scanner;

/**
 * @author HẢI TRIỀU 
 * Viết chương trình in ra tổng của 10 số chẵn đầu tiên.
 *
 */
public class Bai12 {
	public static void main(String[] args) {
//		int n = 0;
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
		int kq = tingTongChan(10);
		System.out.println("tong n so chan dau tien = " + kq);

	}

	public static int tingTongChan(int n) {
		int s = 0;
		int dem = 0;
		int i = 0;
		while (dem <= n) {
			if (i % 2 == 0) {
				s += i;
				dem++;
			}
			i++;
		}
		return s;

	}

}
