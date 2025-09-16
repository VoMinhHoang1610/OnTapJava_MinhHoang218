package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		QuanLy ql_218 = new QuanLy();

		ql_218.nhapDanhSach(sc_218);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql_218.hienThiDanhSachTraCuoiThang();

		sc_218.close();
	}

}
