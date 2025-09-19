package Class;
import java.util.Scanner;

public class CBGV extends Nguoi {

	private double luongCung229;
	private double thuong229;
	private double phat229;
	private double luongThucLinh229;

	public CBGV() {}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung229= sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong229 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat229 = sc.nextDouble();
		sc.nextLine();

		luongThucLinh229 = luongCung229+ thuong229 - phat229;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung229);
		System.out.println("\tThuong: " + thuong229);
		System.out.println("\tPhat: " + phat229);
		System.out.println("\tLuong thuc linh: " + luongThucLinh229);
	}

	public double getLuongThucLinh() {
		return luongThucLinh229;
	}
}
