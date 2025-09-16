package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen_218;
	private Date ngaySinh_218;
	private String ngheNghiep_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen_218, Date ngaySinh_218, String ngheNghiep_218) {
		this.hoTen_218 = hoTen_218;
		this.ngaySinh_218 = ngaySinh_218;
		this.ngheNghiep_218 = ngheNghiep_218;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap ho ten: ");
		hoTen_218 = sc_218.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate_218 = sc_218.nextLine();
		ngaySinh_218 = strToDate(strDate_218);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep_218 = sc_218.nextLine();
	}

	// ham thuc hien chuyen string sang date
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

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_218);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh_218));
		System.out.println("\tNghe nghiep: " + ngheNghiep_218);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date_218) {
		SimpleDateFormat sdf_218 = new SimpleDateFormat("dd-MM-yyyy");
		String strDate_218 = sdf_218.format(date_218);
		return strDate_218;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh_218;
	}
}
