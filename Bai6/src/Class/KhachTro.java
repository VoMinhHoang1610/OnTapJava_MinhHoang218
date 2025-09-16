package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro_218;
	private String loaiPhong_218;
	private double giaPhong_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen_218, int CMND_218, int soNgayTro_218,
			String loaiPhong_218, double giaPhong_218) {
		this.hoTen_218 = hoTen_218;
		this.CMND_218 = CMND_218;
		this.soNgayTro_218 = soNgayTro_218;
		this.loaiPhong_218 = loaiPhong_218;
		this.giaPhong_218 = giaPhong_218;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc_218) {
		super.nhapThongTin(sc_218);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro_218 = sc_218.nextInt();
		sc_218.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong_218 = sc_218.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong_218 = sc_218.nextDouble();
		sc_218.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro_218);
		System.out.println("\tLoai phong: " + loaiPhong_218);
		System.out.println("\tGia phong: " + giaPhong_218);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro_218;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong_218;
	}
}
