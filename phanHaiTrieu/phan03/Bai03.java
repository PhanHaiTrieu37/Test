package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai03 {
	static int tinhTong(int n) {
		int s = 0;
		for (int i = 0; i <= n; i++) {
			if (n % 2 == 0 && i % 2 == 0) {
				// System.out.println(i);
				s += i;
			}
			if (n % 2 != 0 && i % 2 != 0) {
				// System.out.println(i);
				s += i;

			}

		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {

			n = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chu");
		}
		int tong = tinhTong(n);
		System.out.println("tong cua n = " + tong);

	}
}
