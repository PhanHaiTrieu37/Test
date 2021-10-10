package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

import phanHaiTrieu.phan03.Bai06;

/**
 * @author HẢI TRIỀU Tính tổng các số nguyên tố nhỏ hơn N
 */
public class Bai07 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		try {
			do {
				
			
			System.out.print("nhap so n :");
			n = sc.nextInt();
			} while (n < 0);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chuoi");
		}
		
		int kq = tinhTongSNT(n);
		System.out.println("tong cac so nguyen to = " + kq);

	}

	public static int tinhTongSNT(int n) {
		int s = 0;
		for (int i = 2; i <= n; i++) {
			if (Bai06.ktSNT(i) == true) {
				s += i;
			}
		}
		return s;
	}

}
