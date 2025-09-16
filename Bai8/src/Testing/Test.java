package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		QuanLy ql_218 = new QuanLy();

		ql_218.nhapDanhSach(sc_218);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql_218.timKiem(8000000);

		sc_218.close();
	}

}
