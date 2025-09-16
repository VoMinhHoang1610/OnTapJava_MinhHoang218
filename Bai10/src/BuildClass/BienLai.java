package BuildClass;
import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi_218;
	private int chiSoCu_218;
	private double tien_218;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}
	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi_218, int chiSoCu_218, double tien_218) {
		this.chiSoMoi_218 = chiSoMoi_218;
		this.chiSoCu_218 = chiSoCu_218;
		this.tien_218 = tien_218;
	}

	public BienLai(String tenChuHo_218, int chiSoMoi_218, int chiSoCu_218, double tien_218) {
		this.tenChuHo_218 = tenChuHo_218;
		this.chiSoMoi_218 = chiSoMoi_218;
		this.chiSoCu_218 = chiSoCu_218;
		this.tien_218 = tien_218;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu_218 = sc_218.nextInt();
		sc_218.nextLine();
		tien_218 = (chiSoMoi_218 - chiSoCu_218) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi_218);
		System.out.println("\tChi so cu: " + chiSoCu_218);
		System.out.println("\tTien: : " + tien_218);
	}
}
