package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds_218;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds_218 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo_218) {
		ds_218.add(canBo_218);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc_218) {
		CBGV canBo_218;

		System.out.print("Nhap vao so luong can bo: ");
		int n_218 = sc_218.nextInt();
		sc_218.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("Can bo thu " + (i_218 + 1) + " la:");
			canBo_218 = new CBGV();
			canBo_218.nhapThongTin(sc_218);
			themCBGV(canBo_218);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb_218 : ds_218) {
			cb_218.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong_218) {
		for (CBGV cb_218 : ds_218) {
			if (cb_218.getLuongThucLinh() >= luong_218) {
				cb_218.hienThiThongTin();
			}
		}
	}
}
