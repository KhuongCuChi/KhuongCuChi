package khuongphq_baicoban;

import java.util.Scanner;

public class nhapxuathoten {

	public static void main(String[] args) {
		// Khai báo các biến nhập vào
		String hoten;
		int tuoi;
		double chieucao;
		double cannang;
		// Tạo đối tượng của lớp  scanner để nhập
		Scanner banphim; //khai báo
		banphim = new Scanner(System.in);
		//doc du lieu tu ban phim
		
		//In ra hướng dẫn cho User biết cần làm gì
		System.out.print("Họ tên? ");
		hoten= banphim.nextLine(); 
		System.out.print("Tuổi? ");
		tuoi = banphim.nextInt();
		System.out.print("Chiều cao (m)? ");
		chieucao = banphim.nextDouble();
		System.out.print("Cân nặng (kg)? ");
		cannang = banphim.nextDouble();
		
		// Xuất thông tin
		System.out.println("===========================");
		System.out.println("Name: " + hoten);
		System.out.println("Age: " + tuoi);
		System.out.println("Weight: " + cannang);
		System.out.println("Height: " + chieucao);
		System.out.println("===========================");
			}

}
