package Class;
import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1_218;
	private String mon2_218;
	private String mon3_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1_218, String mon2_218, String mon3_218) {
		this.mon1_218 = mon1_218;
		this.mon2_218 = mon2_218;
		this.mon3_218 = mon3_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap mon 1: ");
		mon1_218 = sc_218.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2_218 = sc_218.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3_218 = sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1_218 + " - " + mon2_218 + " - " + mon3_218);
	}
}
