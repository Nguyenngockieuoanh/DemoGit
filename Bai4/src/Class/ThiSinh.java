package Class;
import java.util.Scanner;

public class ThiSinh {
	private int soBD229;
	private String hoTen229;
	private String diaChi229;
	private String dienUuTien229;
        
	public ThiSinh() {}
        
	public ThiSinh(int soBD229, String hoTen229, String diaChi229, String dienUuTien229) {
		this.soBD229= soBD229;
		this.hoTen229 = hoTen229;
		this.diaChi229 = diaChi229;
		this.dienUuTien229 = dienUuTien229;
	}
        
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD229 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen229 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi229 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien229= sc.nextLine();
	}
        
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD229);
		System.out.println("\tHo ten: " + hoTen229);
		System.out.println("\tDia chi: " + diaChi229);
		System.out.println("\tDien uu tien: " + dienUuTien229);
	} 
        
	public int getSoBD() {
		return soBD229;
	}
}
