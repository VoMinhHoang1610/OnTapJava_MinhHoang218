package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen_218;
	protected String maSV_218;
	protected String ngaySinh_218;
	protected String lop_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen_218, String maSV_218, String ngaySinh_218, String lop_218) {
		this.hoTen_218 = hoTen_218;
		this.maSV_218 = maSV_218;
		this.ngaySinh_218 = ngaySinh_218;
		this.lop_218 = lop_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ho ten: ");
		hoTen_218 = sc_218.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV_218 = sc_218.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_218 = sc_218.nextLine();

		System.out.print("\tNhap lop: ");
		lop_218 = sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_218);
		System.out.println("\tNgay sinh: " + ngaySinh_218);
		System.out.println("\tMa sinh vien: " + maSV_218);
		System.out.println("\tLop: " + lop_218);
	}
}
