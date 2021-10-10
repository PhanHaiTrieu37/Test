package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author HẢI TRIỀU Viết chương trình kiểm tra số nhập vào có phải là số nguyên
 *         tố hay không ?
 */
public class Bai06 {
	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("nhap so n :");
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chuoi");
		}
		boolean snt = false;
		snt = ktSNT(n);
		 if (snt == true) {
	           System.out.println(n + " la so nguyen to");
	       } else {
	           System.out.println(n + " khong phai so nguyen to");
	       }
		 System.out.println(snt);
	}

	public static boolean ktSNT(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

}
