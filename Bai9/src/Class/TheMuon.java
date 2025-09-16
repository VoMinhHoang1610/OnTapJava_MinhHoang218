package Class;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon_218;
	private Date ngayMuon_218;
	private Date hanTra_218;
	private String soHieu_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}
	// ham khoi tao co doi so
	public TheMuon(int soMuon_218, Date ngayMuon_218, String soHieu_218) {
		this.soMuon_218 = soMuon_218;
		this.ngayMuon_218 = ngayMuon_218;
		this.soHieu_218 = soHieu_218;
	}
	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);
		System.out.print("\tNhap so muon: ");
		soMuon_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon_218 = sc_218.nextLine();
		ngayMuon_218 = strToDate(strNgayMuon_218);
		String strNgayTra_218 = "31-12-2020";
		hanTra_218 = strToDate(strNgayTra_218);
		System.out.println("\tNhap so hieu: ");
		soHieu_218 = sc_218.nextLine();
	}

	private Date strToDate(String strNgayMuon_218) {
		Date date_218 = null;

		SimpleDateFormat sdf_218 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_218 = sdf_218.parse(strNgayMuon_218);
		} catch (ParseException e_218) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_218;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon_218);
		System.out.println("\tNgay muon: " + ngayMuon_218);
		System.out.println("\tHan tra: " + hanTra_218);
		System.out.println("\tSo hieu: " + soHieu_218);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra_218;
	}
}
