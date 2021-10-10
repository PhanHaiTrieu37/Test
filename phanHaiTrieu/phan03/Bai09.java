package phanHaiTrieu.phan03;

import java.util.Scanner;

/**
 * @author HẢI TRIỀU Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi
 *
 */
public class Bai09 {
	public static void main(String[] args) {
		
		String str = new String();
		System.out.print("nhap chuoi: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int kq = traKiTu(str);
		System.out.println("so lan ki tu a xuat hien trong chuoi = " + kq);
	}

	public static int traKiTu(String str) {
		int dem = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				dem++;
			}
		}
		return dem;

	}
}
