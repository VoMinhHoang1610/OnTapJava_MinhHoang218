package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen_218;
	protected Date ngaySinh_218;
	protected String queQuan_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_218, Date ngaySinh_218, String queQuan_218) {
		this.hoTen_218 = hoTen_218;
		this.ngaySinh_218 = ngaySinh_218;
		this.queQuan_218 = queQuan_218;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ho ten: ");
		hoTen_218 = sc_218.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate_218 = sc_218.nextLine();
		ngaySinh_218 = strToDate(strDate_218);

		System.out.print("\tNhap que quan: ");
		queQuan_218 = sc_218.nextLine();
	}

	private Date strToDate(String strDate_218) {
		Date date_218 = null;

		SimpleDateFormat sdf_218 = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date_218 = sdf_218.parse(strDate_218);
		} catch (ParseException e_218) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date_218;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_218);
		System.out.println("\tNgay sinh: " + ngaySinh_218);
		System.out.println("\tQue quan: " + queQuan_218);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan_218;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_218;
	}
}
