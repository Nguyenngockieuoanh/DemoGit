package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
	private int chiSoMoi229;
	private int chiSoCu229;
	private double tien229;

	public BienLai() {}

	public BienLai(int chiSoMoi229, int chiSoCu229, double tien229) {
		this.chiSoMoi229= chiSoMoi229;
		this.chiSoCu229 = chiSoCu229;
		this.tien229 = tien229;
	}

	public BienLai(String tenChuHo229, int chiSoMoi229, int chiSoCu229, double tien229) {
		this.tenChuHo229 = tenChuHo229;
		this.chiSoMoi229 = chiSoMoi229;
		this.chiSoCu229= chiSoCu229;
		this.tien229 = tien229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi229 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu229 = sc.nextInt();
		sc.nextLine();
		tien229 = (chiSoMoi229 - chiSoCu229) * 750;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi229);
		System.out.println("\tChi so cu: " + chiSoCu229);
		System.out.println("\tTien: : " + tien229);
	}
}
