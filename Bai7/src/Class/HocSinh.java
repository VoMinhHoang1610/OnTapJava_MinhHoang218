package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop_218;
	private String khoHoc_218;
	private String kyHoc_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen_218, String lop_218, String khoaHoc_218, String kyHoc_218) {
		this.hoTen_218 = hoTen_218;
		this.lop_218 = lop_218;
		this.khoHoc_218 = khoaHoc_218;
		this.kyHoc_218 = kyHoc_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);

		System.out.print("\tNhap lop: ");
		lop_218 = sc_218.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc_218 = sc_218.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc_218 = sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop_218);
		System.out.println("\tKhoa hoc: " + khoHoc_218);
		System.out.println("\tKy hoc: " + kyHoc_218);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop_218;
	}
}