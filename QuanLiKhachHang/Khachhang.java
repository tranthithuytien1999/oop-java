package QuanLiKhachHang;

import java.util.Scanner;


public class Khachhang {
    private String maKH;
    private String hoTen;
    private int namSinh;
    public int tongLuong;
    Khachhang(){
        
    }
     Khachhang(String maKH){
         this.maKH = maKH;
	}  
     Khachhang(String maKH,String hoTen,int namSinh,int tongLuong){
         this.maKH = maKH;
         this.hoTen = hoTen;
         this.namSinh= namSinh;
         this.tongLuong = tongLuong;
     } 

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(int tongLuong) {
        this.tongLuong = tongLuong;
    }
     public void NhapTT(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ma khach hang : ");
         maKH = sc.nextLine();
         System.out.println("Ten khach hang : ");
         hoTen  = sc.nextLine();
         System.out.println("Nam sinh : ");
         namSinh  = Integer.parseInt(sc.nextLine());
         System.out.println("Tong luong : ");
         tongLuong  =Integer.parseInt(sc.nextLine());
         
         
         
     }
     public void HienThiTT(){
         System.out.println("Ma khach hang : "+maKH);
         System.out.println("Ten khach hang : "+hoTen);
         System.out.println("Nam sinh : "+namSinh);
         System.out.println("Tong luong : "+tongLuong);
     }

    int getTongluong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


