package Class;

import java.util.Scanner;

public class KhachHang {
	protected String tenChuHo229;
	protected int soNha229;
	protected String maCongTo229;
        
	public KhachHang() {}
        
	public KhachHang(String tenChuHo229, int soNha229, String maCongTo229) {
		this.tenChuHo229 = tenChuHo229;
		this.soNha229 = soNha229;
		this.maCongTo229 = maCongTo229;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo229 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha229 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo229 = sc.nextLine();
	}
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo229);
		System.out.println("\tSo nha: " + soNha229);
		System.out.println("\tMa cong to: " + maCongTo229);
	}
}
