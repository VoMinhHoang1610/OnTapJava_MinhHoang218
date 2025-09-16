package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl_218;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl_218 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl_218) {
		dstl_218.add(tl_218);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc_218) {
		int chon_218;
		String stop_218;
		TaiLieu tl_218;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon_218 = sc_218.nextInt();
			sc_218.nextLine();

			switch (chon_218) {
			case 1:
				tl_218 = new Sach();
				break;
			case 2:
				tl_218 = new TapChi();
				break;
			case 3:
				tl_218 = new Bao();
				break;
			default:
				tl_218 = new Sach();
				break;
			}
			tl_218.nhapThongTin(sc_218);
			themTaiLieu(tl_218);
			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop_218 = sc_218.nextLine();
		} while (stop_218.equals("c"));
	}
	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL_218) {
		for (TaiLieu tl_218 : dstl_218) {
			if (maTL_218.equals(tl_218.getMaTaiLieu())) {
				tl_218.hienThiThongTin();
			}
		}
	}
	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai_218) {
		for (TaiLieu tl_218 : dstl_218) {
			if (loai_218.equals("Sach") && (tl_218 instanceof Sach)) {
				tl_218.hienThiThongTin();
			} else if (loai_218.equals("TapChi") && (tl_218 instanceof TapChi)) {
				tl_218.hienThiThongTin();
			} else if (loai_218.equals("Bao") && (tl_218 instanceof Bao)) {
				tl_218.hienThiThongTin();
			}
		}
	}
}
