package QuanLiTienDien;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
		
                int luachon,n;
                Bienlai[] danhsachHD = null;
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Nhap thong tin cho n ho dan su dung dien.");
                System.out.println("2. Hien thi thong tin tat ca ho dan.");
                System.out.println("3. Thoat chuong trinh");
                do {
                    System.out.println("Moi ban nhap lua chon");
                    luachon = Integer.parseInt(sc.nextLine());
                    if(luachon<1||luachon>2)
                    {
                        System.out.println("Ban nhap khong hop le vui long kiem tra lai.");
                        
                    }
                    
                    switch(luachon){
                        case 1 : {
                            System.out.println("Nhap vao so ho dan");
                            n = Integer.parseInt(sc.nextLine());
                            danhsachHD = new Bienlai[n];
                            
                            for(int i=0;i<danhsachHD.length;i++){
                            	danhsachHD[i] = new Bienlai();             
                                danhsachHD[i].NhapThongTin();
                            }
                            break;
                        }
                        case 2 : {
                            System.out.println("Thong tin ho dan :");
                            for (int i=0;i<danhsachHD.length;i++)
                            {
                                danhsachHD[i].HienThiThongTin();
                            }
                            break;
                        }
                        case 3 : {
                            break;
                        }
                    }
                }while(luachon!=3);
    }
}

