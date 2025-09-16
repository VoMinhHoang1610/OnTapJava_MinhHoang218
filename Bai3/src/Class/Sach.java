package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_218;
	private int soTrang_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}
	// ham khoi tao co doi so
	public Sach(String maTaiLieu_218, String tenNXB_218,
			int soBanPhatHanh_218, String tacGia_218, int soTrang_218) {
		super(maTaiLieu_218, tenNXB_218, soBanPhatHanh_218);
		this.tacGia_218 = tacGia_218;
		this.soTrang_218 = soTrang_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap tac gia: ");
		tacGia_218 = sc_218.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang_218 = sc_218.nextInt();
		sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_218);
		System.out.println("\tSo trang: " + soTrang_218);
	}
}
