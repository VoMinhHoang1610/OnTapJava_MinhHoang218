package Test;

import java.util.Scanner;
import Class.PhanSo;

public class TestClass {

    public static void main(String[] args) {
        Scanner sc_218 = new Scanner(System.in);
        PhanSo ps1_218 = new PhanSo();
        PhanSo ps2_218 = new PhanSo();
        PhanSo psTong_218 = new PhanSo();
        
        // nhập phân số
        System.out.println("Nhap vao phan so thu nhat:");
        ps1_218.nhapPS(sc_218);
        System.out.println("Nhap vao phan so thu hai:");
        ps2_218.nhapPS(sc_218);
        
        // tính tổng 2 phân số
        psTong_218 = ps1_218.congPS(ps2_218);
        
        // hiển thị phân số
        System.out.println("\nPhan so thu nhat la:");
        ps1_218.hienThiPS();
        System.out.println("\nPhan so thu hai la:");
        ps2_218.hienThiPS();
        System.out.println("\nPhan so tong la:");
        psTong_218.hienThiPS();
        
        sc_218.close();
    }
}
