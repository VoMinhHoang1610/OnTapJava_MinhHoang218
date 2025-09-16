package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung_218;
	private double thuong_218;
	private double phat_218;
	private double luongThucLinh_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);

		System.out.print("\tNhap luong cung: ");
		luongCung_218 = sc_218.nextDouble();
		sc_218.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong_218 = sc_218.nextDouble();
		sc_218.nextLine();

		System.out.print("\tNhap phat: ");
		phat_218 = sc_218.nextDouble();
		sc_218.nextLine();

		// tinh luong
		luongThucLinh_218 = luongCung_218 + thuong_218 - phat_218;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung_218);
		System.out.println("\tThuong: " + thuong_218);
		System.out.println("\tPhat: " + phat_218);
		System.out.println("\tLuong thuc linh: " + luongThucLinh_218);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh_218;
	}
}
