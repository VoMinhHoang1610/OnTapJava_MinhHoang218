package Testing;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		KhuPho qlkp_218 = new KhuPho();

		qlkp_218.nhapDanhSach(sc_218);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp_218.timKiemThongTin();
	}

}
