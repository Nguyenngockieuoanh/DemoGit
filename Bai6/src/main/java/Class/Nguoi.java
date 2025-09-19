/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen229;
    protected Date ngSinh229;
    protected int CMND229;
    
    public Nguoi(){}
    
    public Nguoi( String hoTen229,Date ngSinh229,int CMND229 ){
        this.hoTen229=hoTen229;
        this.ngSinh229=ngSinh229;
        this.CMND229=CMND229;
    }
    
    public void nhapThongTin(Scanner sc)       {
        System.out.print("\t Nhap ho ten:");  
        hoTen229=sc.nextLine();
        System.out.print("\t Nhap ngay sinh:");
        String strDate=sc.nextLine();
        ngSinh229=strToDate(strDate);
        System.out.print("\t Nhap CMND:");
        CMND229=sc.nextInt();
    }  
    
    private Date strToDate(String strDate){
        Date date= null;
        SimpleDateFormat spf= new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=spf.parse(strDate);
        } catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang!!");
        }
        return date;
    }
    
    public void hienThiThongTin() {
    System.out.println("\tHo ten: " + hoTen229);
    System.out.println("\tNgay sinh: " + ngSinh229);
    System.out.println("\tHo ten: " + hoTen229);
    } 
    
    public int getCMND229(){
        return CMND229;
    }
}
