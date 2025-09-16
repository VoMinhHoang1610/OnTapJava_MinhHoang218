package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds_218;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds_218 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt_218) {
		ds_218.add(kt_218);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_218) {
		KhachTro khach_218;

		System.out.print("Nhap vao so luong khach: ");
		int n_218 = sc_218.nextInt();
		sc_218.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("Khach tro thu " + (i_218 + 1) + " la:");
			khach_218 = new KhachTro();
			khach_218.nhapThongTin(sc_218);
			themKhachTro(khach_218);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach_218 : ds_218) {
			khach_218.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND_218) {
		double tien_218 = 0;

		for (KhachTro khach_218 : ds_218) {
			if (khach_218.getCMND() == CMND_218) {
				tien_218 = khach_218.getSoNgayTro() * khach_218.getGiaPhong();
			}
		}

		return tien_218;
	}
}
