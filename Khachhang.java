package QuanLiTienDien;

import java.util.Scanner;


class Khachhang {
    String hoTen;
    int soNha;
    int soCongTo;
    
    public Khachhang(){
    	
        
    }
    public Khachhang(String hoTen, int soNha, int soCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.soCongTo = soCongTo;
    
}

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getSoCongTo() {
        return soCongTo;
    }

    public void setSoCongTo(int soCongTo) {
        this.soCongTo = soCongTo;
    }
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten ho dan su dung");
        hoTen = sc.nextLine();
        System.out.println("So nha");
        soNha = Integer.parseInt(sc.nextLine());
        System.out.println("So cong to");
        soCongTo = Integer.parseInt(sc.nextLine());
        
    }
    public void HienThiThongTin(){
        System.out.println("Ho ten ho dan :"+hoTen);
        System.out.println("So nha :"+soNha);
        System.out.println("So cong to :"+soCongTo);
        
        
    }
    
}

