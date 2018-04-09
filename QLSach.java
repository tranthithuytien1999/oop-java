package QuanLiSach;

import java.util.ArrayList;
import java.util.Scanner;


public class QLSach {

    
    public static void main(String[] args) {
        ArrayList<Sach> danhsach = new ArrayList<>();
        int n;
        int luachon;
        int[] Aarray = null;
        
        System.out.println("1. Nhap vao n quyen sach.");
        System.out.println("2. Hien thi toan bo quyen sach.");
        System.out.println("3. Liet ke sach XB truoc nam n");
        System.out.println("4. Thoat chuong trinh");
        
        do {
             System.out.println("Moi ban nhap vao lua chon");
             luachon = Integer.parseInt(new Scanner(System.in).nextLine());
             switch(luachon){
                 case 1:{
                      System.out.println("So luong sach :");
                      n = Integer.parseInt(new Scanner(System.in).nextLine());
                      int[] Array = new int[n];
                      for(int i=0;i<Array.length;i++){
                          Sach s = new Sach();
                          s.NhapTT();
                          danhsach.add(s);
                      }
                     break;
                 }
                 case 2: {
                     System.out.printf("%-20s %-20s %-10s", "Ten Sach", "Ten Tac Gia", "Nam Xuat Ban");
                     for(int i=0;i<danhsach.size();i++){
                         danhsach.get(i).HienThiTT();
                     }
                     System.out.println("\n");
                     break;
                 }
                 case 3: {
                     int nam;
                     int dem = 0;
                     System.out.println("Nhap vao namXB");
                     nam = Integer.parseInt(new Scanner(System.in).nextLine());
                     System.out.printf("%-20s %-20s %-10s", "Ten Sach", "Ten Tac Gia", "Nam Xuat Ban");
                     for (int i=0; i<danhsach.size();i++){
                         if(nam>danhsach.get(i).getNamXB()){
                             danhsach.get(i).HienThiTT();
                             dem++;
                         }
                     }
                     if(dem==0){
                         System.out.println("Khong co quyen sach nao xuat ban truoc nam:"+nam);
                     }
                         
                     
                         
                     
                     break;
                 }
                 case 4: {
                     break;
                 }
                     
             }
            
        }while(luachon!=4);
    }
    
}
