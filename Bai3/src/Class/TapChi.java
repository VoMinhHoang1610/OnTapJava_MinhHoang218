package Class;
import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh_218;
	private int thangPhatHanh_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu_218, String tenNXB_218, 
			int soBanPhatHanh_218, int soPhatHanh_218, int thangPhatHanh_218) {
		super(maTaiLieu_218, tenNXB_218, soBanPhatHanh_218);
		this.soPhatHanh_218 = soPhatHanh_218;
		this.thangPhatHanh_218 = thangPhatHanh_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh_218 = sc_218.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh_218 = sc_218.nextInt();
		sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh_218);
		System.out.println("\tThang phat hanh: " + thangPhatHanh_218);
	}
}
