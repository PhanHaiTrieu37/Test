package phanHaiTrieu.phan03;

import java.util.Scanner;

public class Bai11 {
	/**
	 * @param args Viết hàm để đếm số lượng ký tự là số có trong chuỗi s. Chuỗi s được nhập từ bàn phím.
	 */
	public static void main(String[] args) {
		System.out.println("Nhap chuoi can kiem tra: ");
		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		System.out.println("so ky tu trong chuoi = "+ ktChuoi(str));
		
		
	}
	public static int ktChuoi(String str){
		int dem = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 48 && str.charAt(i) < 57 ){
				dem ++;
			}
		}
		return dem;
	}

}
