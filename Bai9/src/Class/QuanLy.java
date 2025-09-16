package Class;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds_218 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon_218) {
		ds_218.add(theMuon_218);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc_218) {
		TheMuon theMuon_218;

		System.out.print("Nhap vao so luong the muon: ");
		int n_218 = sc_218.nextInt();
		sc_218.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("The muon thu " + (i_218 + 1) + " la:");
			theMuon_218 = new TheMuon();
			theMuon_218.nhapThongTin(sc_218);
			themTheMuon(theMuon_218);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		Calendar cal_218 = Calendar.getInstance();

		for (TheMuon the_218 : ds_218) {
			Date hanTra_218 = the_218.getHanTra();
			if (hanTra_218 == null) continue;
			cal_218.setTime(hanTra_218);
			int day_218 = cal_218.get(Calendar.DAY_OF_MONTH);
			if (day_218 == 31 || day_218 == 30) {
				the_218.hienThiThongTin();
			}
		}
	}
}
