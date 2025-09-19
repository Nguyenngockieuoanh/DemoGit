package Class;
import java.util.Scanner;
public class KhoiA extends ThiSinh {
	private String mon1229;
	private String mon2229;
	private String mon3229;
        
	public KhoiA() {}

	public KhoiA(String mon1229, String mon2229, String mon3229) {
		this.mon1229 = mon1229;
		this.mon2229= mon2229;
		this.mon3229 = mon3229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1229 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2229= sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3229 = sc.nextLine();
	}
        
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1229 + " - " + mon2229+ " - " + mon3229);
	}
}
