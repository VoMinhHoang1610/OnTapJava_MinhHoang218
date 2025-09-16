package Class;
import java.util.Scanner;
public class ThiSinh {
	// thuoc tinh
	private int soBaoDanh_218;
	private String hoTen_218;
	private String diaChi_218;
	private String dienUuTien_218;
	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {
	}
	// ham khoi tao co doi so
	public ThiSinh(int soBaoDanh_218, String hoTen_218,
			String diaChi_218, String dienUuTien_218) {
		this.soBaoDanh_218 = soBaoDanh_218;
		this.hoTen_218 = hoTen_218;
		this.diaChi_218 = diaChi_218;
		this.dienUuTien_218 = dienUuTien_218;
	}
	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBaoDanh_218 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen_218 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi_218 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien_218 = sc.nextLine();
	}
	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBaoDanh_218);
		System.out.println("\tHo ten: " + hoTen_218);
		System.out.println("\tDia chi: " + diaChi_218);
		System.out.println("\tDien uu tien: " + dienUuTien_218);
	}
	// ham lay ra thong tin ve so bao danh
	public int getSoBaoDanh_218() {
		return soBaoDanh_218;
	}
}

