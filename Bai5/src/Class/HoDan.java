package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	private int soNguoi229;
	private int soNha229;
	private Nguoi[] list; 
        
	public HoDan() {
		list = new Nguoi[10];
	}

	public HoDan(String hoTen229, Date ngaySinh229, String ngheNghiep229, int soNguoi229, int soNha229) {
		super(hoTen229, ngaySinh229, ngheNghiep229);
		this.soNguoi229 = soNguoi229;
		this.soNha229 = soNha229;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi229 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha229 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi229; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i] = new Nguoi();
			list[i].nhapThongTin(sc);
		}
	}

	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi229);
		System.out.println("\tSo nha: " + soNha229);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi229; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i].hienThiThongTin();
		}
	}

	public Nguoi[] getList() {
		return list;
	}

	public int getSoNguoi() {
		return soNguoi229;
	}
}
