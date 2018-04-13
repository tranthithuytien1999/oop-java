package QuanLiSach;

import java.util.Scanner;


public class Sach {
    private String tenSach;
    private String tenTacGia;
    private int namXB;
    
    
    Sach (){
        
    }
    Sach (String tenSach, String tenTacGia, int namXB){
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namXB = namXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }
    
    
    public void NhapTT (){
        System.out.println("Ten sach : ");
        tenSach = new Scanner(System.in).nextLine();
        System.out.println("Ten tac gia :");
        tenTacGia = new Scanner(System.in).nextLine();
        System.out.println("Nam sinh :");
        namXB = Integer.parseInt(new Scanner(System.in).nextLine());
        
        
    }
    
    public void HienThiTT (){
        System.out.printf("%-20s %-20s %-10d",tenSach,tenTacGia,namXB);
    }
    
}

