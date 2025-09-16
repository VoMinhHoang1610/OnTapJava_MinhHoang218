package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu_218, String tenNXB_218,
			int soBanPhatHanh_218, String ngayPhatHanh_218) {
		super(maTaiLieu_218, tenNXB_218, soBanPhatHanh_218);
		this.ngayPhatHanh_218 = ngayPhatHanh_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh_218 = sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh_218);
	}
}

