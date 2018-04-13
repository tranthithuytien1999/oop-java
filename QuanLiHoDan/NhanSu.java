package QuanLiHoDan;

import java.util.Scanner;


public class NhanSu {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String ngheNghiep;
    
    public NhanSu(){
        
    }
    
    public NhanSu (String hoTen, int tuoi, int namSinh, String ngheNghiep){
        this.hoTen = hoTen;
        this.tuoi= tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
        
    }
    
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten thanh vien :");
        hoTen = sc.nextLine();
        while(true) {
        	try {
        		 System.out.println("Tuoi");
        	        tuoi =Integer.parseInt(sc.nextLine());
        	        if(tuoi<0) {
        	        	throw new NumberFormatException();
        	        }
        	        break;
      
        	}catch (NumberFormatException e) {
       		 System.out.println("Ban can nhap so nguyen duong");
       	}

        }
        while(true) {
        	try {
        		System.out.println("Nam sinh");
      	        namSinh = Integer.parseInt(sc.nextLine());
      	        if(namSinh<0) {
      	        	throw new NumberFormatException();
      	        }
      	        break;
        	}catch(NumberFormatException e){
        		
        		 System.out.println("Ban can nhap so nguyen duong>0");
        	}
        }
       
       
        System.out.println("Nghe nghiep : ");
        ngheNghiep = sc.nextLine();
        
    }
    public void HienThiTT (){
        System.out.println("Ho ten thanh vien :"+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Nam sinh : "+namSinh);
        System.out.println("Nghe nghiep : "+ngheNghiep);
    }
    
}