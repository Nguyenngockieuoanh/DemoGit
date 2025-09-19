package Class;
import java.util.Scanner;
public class Nguoi {

	protected String hoTen229;
	protected String ngaySinh229;
	protected String queQuan229;
        
	public Nguoi() {}
        
	public Nguoi(String hoTen229, String ngaySinh229, String queQuan229) {
		this.hoTen229 = hoTen229;
		this.ngaySinh229= ngaySinh229;
		this.queQuan229 = queQuan229;
	}
        
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen229 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh229 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan229= sc.nextLine();
	}
        
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen229);
		System.out.println("\tNgay sinh: " + ngaySinh229);
		System.out.println("\tQue quan: " + queQuan229);
	}
}
