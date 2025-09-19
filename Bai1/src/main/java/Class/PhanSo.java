/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

public class PhanSo {
    private int tuSo229;
    private int mauSo229;
    
    public PhanSo(){
        tuSo229 = 0;
        mauSo229 = 1;
    }
    
    public PhanSo(int tuSo229,int mauSo229){
        this.tuSo229 = tuSo229;
        this.mauSo229 = mauSo229;
    }
    
    public void NhapPS(Scanner sc){
        int a229;
        int b229;
        do{
            System.out.println("\nNhap vao tu so: ");
            a229 = sc.nextInt();
            System.out.println("\nNhap vao mau so: ");
            b229 = sc.nextInt();
            if(b229 == 0){
                System.out.println("\nLoi! Mau so khong duoc bang 0.Nhap lai!");
            }else{
                tuSo229 = a229;
                mauSo229 =b229;
            }
        }
        while(b229 == 0);
    }
    
       public void Xuat(){
        if(tuSo229 * mauSo229 < 0){
            System.out.println("\t-" +Math.abs(tuSo229) + "/" +Math.abs(mauSo229));
        }else{
            System.out.println("\t"+Math.abs(tuSo229) + "/" +Math.abs(mauSo229));
        }
       }
       
       public PhanSo CongPS(PhanSo ps2){
           int a229 = tuSo229*ps2.mauSo229 + ps2.tuSo229*mauSo229;
           int b229 = mauSo229 * ps2.mauSo229;
           
           return new PhanSo(a229,b229);
       }

       public PhanSo NhanPS(PhanSo ps2){
           int a229= tuSo229*ps2.tuSo229;
           int b229 = mauSo229*ps2.mauSo229;
           
           return new PhanSo(a229,b229);
       }

       public PhanSo ChiaPS(PhanSo ps2){
           int a229 = tuSo229*ps2.mauSo229;
           int b229 = mauSo229*ps2.tuSo229;
           
           return new PhanSo(a229,b229);
       }

       private int timUSCLN(int a229, int b229){
           int r229 = a229%b229;
           
           while(r229!=0){
               a229=b229;
               b229=r229;
               r229=a229%b229;
           }
           return b229;
       }
 
       public boolean kiemTraToiGian(){
           if(timUSCLN(tuSo229,mauSo229) == 1){
               return true;
           }
           return false;
       }
       
       //Hàm tối giản 
       public void toiGianPS(){
           int x229 = timUSCLN(tuSo229,mauSo229);
           
           tuSo229/=x229;
           mauSo229/=x229;
       }
    }

