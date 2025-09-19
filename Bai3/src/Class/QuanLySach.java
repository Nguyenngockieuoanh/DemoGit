package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	private ArrayList<TaiLieu> dstl;

	public QuanLySach() {
		dstl = new ArrayList<TaiLieu>(10);
	}

	public void themTaiLieu(TaiLieu tl) {
		dstl.add(tl);
	}

	public void nhapDanhSachTL(Scanner sc) {
		int chon229;
		String stop229;
		TaiLieu tl229;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon229= sc.nextInt();
			sc.nextLine();

			switch (chon229) {
			case 1:
				tl229 = new Sach();
				break;
			case 2:
				tl229 = new TapChi();
				break;
			case 3:
				tl229 = new Bao();
				break;

			default:
				tl229 = new Sach();
				break;
			}

			tl229.nhapThongTin(sc);
			themTaiLieu(tl229);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop229 = sc.nextLine();
		} while (stop229.equals("c"));
	}

	public void timMaTL(String maTL) {
		for (TaiLieu tl229 : dstl) {
			if (maTL.equals(tl229.getMaTaiLieu())) {
				tl229.hienThiThongTin();
			}
		}
	}

	public void timLoaiTL(String loai) {
		for (TaiLieu tl : dstl) {
			if (loai.equals("Sach") && (tl instanceof Sach)) {
				tl.hienThiThongTin();
			} else if (loai.equals("TapChi") && (tl instanceof TapChi)) {
				tl.hienThiThongTin();
			} else if (loai.equals("Bao") && (tl instanceof Bao)) {
				tl.hienThiThongTin();
			}
		}
	}
}
