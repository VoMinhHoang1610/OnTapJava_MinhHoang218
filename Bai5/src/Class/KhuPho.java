package Class;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd_218;
	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd_218 = new ArrayList<HoDan>(10);
	}
	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan_218) {
		dshd_218.add(hoDan_218);
	}
	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc_218) {
		HoDan hoDan_218;
		System.out.print("Nhap vao so ho dan: ");
		int soHoDan_218 = sc_218.nextInt();
		sc_218.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i_218 = 0; i_218 < soHoDan_218; i_218++) {
			System.out.println("Ho dan thu " + (i_218 + 1) + " la:");
			hoDan_218 = new HoDan();
			hoDan_218.nhapThongTin(sc_218);
			themHoDan(hoDan_218);
		}
	}
	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n_218 = dshd_218.size();
		for (int i_218 = 0; i_218 < n_218; i_218++) {
			System.out.println("Ho dan thu " + (i_218 + 1) + " la:");
			dshd_218.get(i_218).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Calendar now_218 = Calendar.getInstance();
		int namHienTai_218 = now_218.get(Calendar.YEAR);

		Nguoi[] dstv_218 = null;
		Calendar cal_218 = Calendar.getInstance();

		for (HoDan hoDan_218 : dshd_218) {
			dstv_218 = hoDan_218.getList();
			for (int i_218 = 0; i_218 < hoDan_218.getSoNguoi(); i_218++) {
				Date ns_218 = dstv_218[i_218].getNgaySinh();
				if (ns_218 == null) continue; // neu ko co ngay sinh thi bo qua
				cal_218.setTime(ns_218);
				int namSinh_218 = cal_218.get(Calendar.YEAR);
				if (namHienTai_218 - namSinh_218 == 80) {
					hoDan_218.hienThiThongTin();
				}
			}
		}
	}
}
