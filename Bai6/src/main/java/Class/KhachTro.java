/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi{
    private int soNgayTro229;
    private String loaiPhong229;
    private double giaPhong229;
    
    public KhachTro(){}
    
    public KhachTro(String hoTen229,int CMND229,int soNgayTro229,String loaiPhong229,Double giaPhong229 ){
        this.hoTen229=hoTen229;
        this.CMND229=CMND229;
        this.soNgayTro229=soNgayTro229;
        this.loaiPhong229=loaiPhong229;
        this.giaPhong229=giaPhong229;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro229 = sc.nextInt(); 
        sc.nextLine();

        System.out.print("\tNhap loai phong: ");
        loaiPhong229 = sc.nextLine();

        System.out.print("\tNhap gia phong: ");
        giaPhong229 = sc.nextDouble(); 
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro229);
        System.out.println("\tLoai phong: " + loaiPhong229);
        System.out.println("\tGia phong: " + giaPhong229);
    }
    
    public int getSoNgayTro(){
        return soNgayTro229;
    }
    
    public Double getGiaPhong(){
        return giaPhong229;
    }
}
