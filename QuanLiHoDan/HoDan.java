package QuanLiHoDan;

import java.util.Scanner;


public class HoDan extends NhanSu {
    private int sothanhvien;
    private String sonha;
    
   
    
    public HoDan(){
        
    }
    
    public HoDan(String hoTen, int tuoi, int namSinh, String ngheNghiep, int sothanhvien, String sonha){
        super(hoTen, tuoi, namSinh, ngheNghiep);
        this.sothanhvien = sothanhvien;
        this.sonha =sonha;
        
    }
    NhanSu[] danhsach = null;
    
    public void NhapTT(){
        Scanner sc = new Scanner(System.in);
        while(true) {
              try {
        	  System.out.println("So thanh vien");
              sothanhvien = Integer.parseInt(new Scanner(System.in).nextLine());
              if(sothanhvien<0) {
            	  throw new NumberFormatException();
              }
              break;
              } catch(NumberFormatException e) {
        	         System.out.println("Ban can nhap so nguyen duong");
        	
        }
        }
      
        danhsach = new NhanSu[sothanhvien];
        
        		System.out.println("So nha");
                sonha = sc.nextLine();
      
        for (int i=0;i<danhsach.length;i++){
            danhsach[i] = new NhanSu();
            super.NhapTT();
        
        
        
        
    }
    }
    
    public void HienThiTT (){
        System.out.println("So thanh vien :"+sothanhvien);
        System.out.println("So nha :"+sonha);
       for(int i=0;i<danhsach.length;i++){
           System.out.println("Thong tin thanh vien thu "+(i+1));
           danhsach[i].HienThiTT();
           
         
       }
          
       
    }
}
