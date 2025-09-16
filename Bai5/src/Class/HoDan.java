package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi_218;
	private int soNha_218;
	private Nguoi[] list_218; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list_218 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen_218, Date ngaySinh_218, 
			String ngheNghiep_218, int soNguoi_218, int soNha_218) {
		super(hoTen_218, ngaySinh_218, ngheNghiep_218);
		this.soNguoi_218 = soNguoi_218;
		this.soNha_218 = soNha_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i_218 = 0; i_218 < soNguoi_218; i_218++) {
			System.out.println("Nguoi thu " + (i_218 + 1) + " la:");
			list_218[i_218] = new Nguoi();
			list_218[i_218].nhapThongTin(sc_218);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi_218);
		System.out.println("\tSo nha: " + soNha_218);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i_218 = 0; i_218 < soNguoi_218; i_218++) {
			System.out.println("Nguoi thu " + (i_218 + 1) + " la:");
			list_218[i_218].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list_218;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi_218;
	}
}
