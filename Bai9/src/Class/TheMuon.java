package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	private int soMuon229;
	private Date ngayMuon229;
	private Date hanTra229;
	private String soHieu229;

	public TheMuon() {}

	public TheMuon(int soMuon229, Date ngayMuon229, String soHieu229) {
		this.soMuon229 = soMuon229;
		this.ngayMuon229 = ngayMuon229;
		this.soHieu229= soHieu229;
	}

	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon229 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon229 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra229 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu229 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}
		return date;
	}

	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon229);
		System.out.println("\tNgay muon: " + ngayMuon229);
		System.out.println("\tHan tra: " + hanTra229);
		System.out.println("\tSo hieu: " + soHieu229);
	}

	public Date getHanTra() {
		return hanTra229;
	}
}
