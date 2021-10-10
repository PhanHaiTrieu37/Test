package phanHaiTrieu.phan03;

public class Bai13 {
	/**
	 * @param args Viết chương trình in ra những số lẻ từ 1 đến 99
	 */
	public static void main(String[] args) {
		System.out.println("in ra so le tu 1 den 99: ");
		show();
		
	}
	public static void show(){
		for (int i = 0; i < 100; i++) {
			if( i % 2 != 0){
				System.out.print(i + " ");
			}
		}
	}

}
