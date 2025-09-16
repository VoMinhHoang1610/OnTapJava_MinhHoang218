package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		QuanLy ql_218 = new QuanLy();
		ql_218.nhapDanhSach(sc_218);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql_218.hienThiDanhSach();

		sc_218.close();
	}

}
