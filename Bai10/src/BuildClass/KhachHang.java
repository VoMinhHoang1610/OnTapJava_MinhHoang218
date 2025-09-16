package BuildClass;
import java.util.Scanner;
public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo_218;
	protected int soNha_218;
	protected String maCongTo_218;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo_218, int soNha_218, String maCongTo_218) {
		this.tenChuHo_218 = tenChuHo_218;
		this.soNha_218 = soNha_218;
		this.maCongTo_218 = maCongTo_218;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo_218 = sc_218.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo_218 = sc_218.nextLine();
	}

	// Ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo_218);
		System.out.println("\tSo nha: " + soNha_218);
		System.out.println("\tMa cong to: " + maCongTo_218);
	}
}
