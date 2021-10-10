package phanHaiTrieu.phan03;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		String chuoi;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhap chuoi: ");
		chuoi = scanner.nextLine();
		tachChuoi(chuoi);
	}
		public static void tachChuoi(String chuoi){
			char kyTu;
			for (int i = 0; i < chuoi.length(); i++) {
			kyTu = chuoi.charAt(i);

			if (Character.isSpaceChar(kyTu)) {

				System.out.println();
			} else {

				System.out.print(kyTu);
			}
		

		
		}
	}
}

