package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author HẢI TRIỀU viết chương trình giải phương trình bậc 1
 *
 */
public class Bai04 {
	public static float giaiPTB1(float a, float b) throws Exception {
		if (a == 0) {
			if (b == 0) {
				throw new Exception("phuong trinh co vo so nghiem !");
			} else {
				throw new Exception("phuong trinh vo nghiem !");

			}
		} else {
			return -b / a;
		}
	}

	public static void main(String[] args) throws Exception {
		float a = 0;
		float b = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai phuong trinh bac 1: ax + b = 0");
		try {
			System.out.print("Nhap a = ");
			a = sc.nextFloat();
			System.out.print("Nhap b = ");
			b = sc.nextFloat();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chuoi");
		}

		float nghiem = giaiPTB1(a, b);

		System.out.println("x = " + nghiem);
	}

}
