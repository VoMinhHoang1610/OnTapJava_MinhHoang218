package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_218;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_218 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb_218) {
		dscb_218.add(cb_218);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc_218) {
		CanBo cb_218;
		System.out.print("Nhap vao so luong can bo: ");
		int n_218 = sc_218.nextInt();
		sc_218.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("Lan nhap thu " + (i_218 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon_218 = sc_218.nextInt();
			sc_218.nextLine();

			cb_218 = new CanBo();

			switch (chon_218) {
			case 1:
				cb_218 = new KySu();
				break;
			case 2:
				cb_218 = new NhanVien();
				break;
			case 3:
				cb_218 = new CongNhan();
				break;

			default:
				cb_218 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb_218.nhapThongTin(sc_218);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb_218);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen_218) {
		for (CanBo cb_218 : dscb_218) {
			if (hoTen_218.equals(cb_218.getHoTen())) {
				cb_218.hienThiThongTin();
			}
		}
	}
}
