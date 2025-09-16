package Class;
import java.util.Scanner;
public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu_218;
	private String tenNXB_218;
	private int soBanPhatHanh_218;
	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {
	}
	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu_218, String tenNXB_218, int soBanPhatHanh_218) {
		this.maTaiLieu_218 = maTaiLieu_218;
		this.tenNXB_218 = tenNXB_218;
		this.soBanPhatHanh_218 = soBanPhatHanh_218;
	}
	// nhap
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu_218 = sc_218.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB_218 = sc_218.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh_218 = sc_218.nextInt();
		sc_218.nextLine();
	}
	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu_218);
		System.out.println("\tTen nha xuat ban: " + tenNXB_218);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh_218);
	}
	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu_218;
	}
}
