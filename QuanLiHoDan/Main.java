package QuanLiHoDan;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        HoDan[] danhsachHD = null;
        int n = 0;
        int luachon;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1.Nhap thong tin cho nho dan");
            System.out.println("2.Hien thi thong tin ho dan trong khu pho");
            System.out.println("3.Thoat chuong trinh");
            
            try {
            	System.out.println("Moi ban nhap vao lua chon");
                luachon = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
            	System.out.println("Ban can nhap so nguyen duong");
            	luachon = 0;
            }
            
           
            
            switch(luachon) {
                case 1 : {
                	while(true){
                		try {
                    		System.out.println("So hodan trong khu pho :");
                            n = Integer.parseInt(sc.nextLine());
                            
                            if(n<0) {
                            	throw new NumberFormatException();
                            }
                            break;
                    	} catch(NumberFormatException e) {
                    		 System.out.println("Ban can nhap so nguyen duong");
                    	}
  
                	
                	}
                    
                    danhsachHD =new HoDan[n];
                    
                    for(int i=0;i<danhsachHD.length;i++){
                        System.out.println("Ho dan thu : "+(i+1));
                        danhsachHD[i] = new HoDan();
                        danhsachHD[i].NhapTT();
                        
                    }
                    
                
                       
                       
                    break;
                }
                case 2 : {
                    for(int i=0;i<danhsachHD.length;i++){
                        danhsachHD[i].HienThiTT();
                    }
                    
                
                break;
            }
            case 3: {
            break;
            
        }
        }
        } while(luachon!=3);
}
}