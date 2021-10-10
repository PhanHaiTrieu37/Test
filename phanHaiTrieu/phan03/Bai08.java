package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

import phanHaiTrieu.phan03.Bai06;

/**
 * @author HẢI TRIỀU Tính tổng N số nguyên tố đầu tiên
 *
 */
public class Bai08 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		try {
			do {
				System.out.print("nhap so N :");
				n = sc.nextInt();
			} while (n < 0);

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chuoi");
		}

		int kq = tinhTongSNTdautien(n);
		System.out.println("tong N so nguyen to dau tien = " + kq);

	}

	public static int tinhTongSNTdautien(int n) {
		int dem = 0;
		int i = 2;
		int s = 0;
		while (dem < n) {
			if (Bai06.ktSNT(i) == true) {

				s += i;
				dem++;
			}
			i++;
		}
		return s;
	}

}
