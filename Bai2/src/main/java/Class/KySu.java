/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao229;
    
    public KySu(){ }
    
    public KySu(String hoTen229,String ngaySinh229,String gioiTinh229,String diaChi229,String nganhDaoTao229){
        super(hoTen229,ngaySinh229,gioiTinh229,diaChi229);
        this.nganhDaoTao229=nganhDaoTao229;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao229=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: "+nganhDaoTao229);    
    }
}
