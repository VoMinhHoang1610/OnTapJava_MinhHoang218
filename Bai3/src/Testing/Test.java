package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc_218 = new Scanner(System.in);

		QuanLySach qls_218 = new QuanLySach();

		qls_218.nhapDanhSachTL(sc_218);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai_218 = sc_218.nextLine();
		qls_218.timLoaiTL(loai_218);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL_218 = sc_218.nextLine();
		qls_218.timMaTL(maTL_218);

		sc_218.close();
	}

}
