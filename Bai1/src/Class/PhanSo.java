package Class;

import java.util.Scanner;

public class PhanSo {
	// thuoc tinh
	private int tuSo_218;
	private int mauSo_218;

	// phuong thuc
	// ham khoi tao khong doi so
	public PhanSo() {
		tuSo_218 = 0;
		mauSo_218 = 1;
	}

	// ham khoi tao co doi so
	public PhanSo(int tuSo_218, int mauSo_218) {
		this.tuSo_218 = tuSo_218;
		this.mauSo_218 = mauSo_218;
	}

	// ham nhap phan so
	public void nhapPS(Scanner sc_218) {
		int a_218;
		int b_218;

		do {
			System.out.print("\tNhap vao tu so: ");
			a_218 = sc_218.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b_218 = sc_218.nextInt();

			// kiem tra
			if (b_218 == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo_218 = a_218;
				mauSo_218 = b_218;
			}
		} while (b_218 == 0);
	}

	// ham hien thi
	public void hienThiPS() {
		if (tuSo_218 * mauSo_218 < 0) {
			System.out.println("\t-" + Math.abs(tuSo_218) + "/" + Math.abs(mauSo_218));
		} else {
			System.out.println("\t" + Math.abs(tuSo_218) + "/" + Math.abs(mauSo_218));
		}
	}

	// ham cong
	public PhanSo congPS(PhanSo ps2_218) {
		int a_218 = tuSo_218 * ps2_218.mauSo_218 + ps2_218.tuSo_218 * mauSo_218;
		int b_218 = mauSo_218 * ps2_218.mauSo_218;

		return new PhanSo(a_218, b_218);
	}

	// ham tru
	public PhanSo truPS(PhanSo ps2_218) {
		int a_218 = tuSo_218 * ps2_218.mauSo_218 - ps2_218.tuSo_218 * mauSo_218;
		int b_218 = mauSo_218 * ps2_218.mauSo_218;

		return new PhanSo(a_218, b_218);
	}

	// ham nhan
	public PhanSo nhanPS(PhanSo ps2_218) {
		int a_218 = tuSo_218 * ps2_218.tuSo_218;
		int b_218 = mauSo_218 * ps2_218.mauSo_218;

		return new PhanSo(a_218, b_218);
	}

	// ham chia
	public PhanSo chiaPS(PhanSo ps2_218) {
		int a_218 = tuSo_218 * ps2_218.mauSo_218;
		int b_218 = mauSo_218 * ps2_218.tuSo_218;

		return new PhanSo(a_218, b_218);
	}

	// ham tim uscln
	private int timUSCLN(int a_218, int b_218) {
		int r_218 = a_218 % b_218;

		while (r_218 != 0) {
			a_218 = b_218;
			b_218 = r_218;
			r_218 = a_218 % b_218;
		}

		return b_218;
	}

	// ham kiem tra phan so toi gian hay chua
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo_218, mauSo_218) == 1) {
			return true;
		}
		return false;
	}

	// ham toi gian
	public void toiGianPS() {
		int x_218 = timUSCLN(tuSo_218, mauSo_218);

		tuSo_218 /= x_218;
		mauSo_218 /= x_218;
	}
}
