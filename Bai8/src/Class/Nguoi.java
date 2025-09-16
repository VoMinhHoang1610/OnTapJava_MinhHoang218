package Class;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_218;
	protected String ngaySinh_218;
	protected String queQuan_218;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_218, String ngaySinh_218, String queQuan_218) {
		this.hoTen_218 = hoTen_218;
		this.ngaySinh_218 = ngaySinh_218;
		this.queQuan_218 = queQuan_218;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ho ten: ");
		hoTen_218 = sc_218.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh_218 = sc_218.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan_218 = sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_218);
		System.out.println("\tNgay sinh: " + ngaySinh_218);
		System.out.println("\tQue quan: " + queQuan_218);
	}
}
