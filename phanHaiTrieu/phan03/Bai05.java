package phanHaiTrieu.phan03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author HẢI TRIỀU Viết chương trình tìm USCLN của 2 số nhập vào.
 */
public class Bai05 {
	private static Scanner sc;

	public static int timUSCLN(int a, int b) {
	    if (b == 0) {
            return a;
        } else {
            return timUSCLN(b, a % b);
        }
    }

	

	public static void main(String[] args) {
		int a=0;
		int b =0;
		sc = new Scanner(System.in);
		try {
			System.out.print("nhap a =");
			a = sc.nextInt();
			System.out.print("nhap b =");
			b = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("khong duoc nhap chuoi");
		}

		int UCLN = timUSCLN(a, b);
		System.out.println("Uoc chung lon nhat (a,b) =" + UCLN);

	}
}
