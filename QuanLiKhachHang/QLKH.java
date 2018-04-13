package QuanLiKhachHang;


	import java.util.ArrayList;
	import java.util.Scanner;


	public class QLKH {

	    private static Object KH;
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] Array;
			ArrayList<Khachhang> danhsach = new ArrayList();
			int n = 0;
	                int luachon;
			System.out.println("1. Nhap vao n khach hang.");
			System.out.println("2. Hien thi thong tin danh sach khach hang.");
			System.out.println("1. Hien thi khach hang co tong luong lon hon x.");
			System.out.println("4. Thoat chuong trinh.");
			
			
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("Moi ban nhap vao lua chon");
				luachon = Integer.parseInt(sc.nextLine());
				try {
					luachon = Integer.parseInt(sc.nextLine());
				} catch(NumberFormatException e) {
					luachon = 0;
					System.out.println("Ban can nhap vao so nguyen");
				}
				
				switch(luachon) {
				    case 1:  {
				    	System.out.println("Nhap vao so luong khach hang.");
				    	luachon = Integer.parseInt(sc.nextLine());
				    	Array = new int[n];
				    	for(int i=0;i<Array.length;i++){
	                                    Khachhang KH = new Khachhang();
	                                    KH.NhapTT();
	                                    danhsach.add(KH);
	                                }
	                                break;
	                            }
	                            case 2 :{
	                                System.out.println("THONG TIN KHACH HANG CO TRONG DANH SACH");
	                                for(int i =0;i<danhsach.size();i++){
	                                System.out.println("Thong tin khach hang :"+(i+1));
	                                danhsach.get(i).HienThiTT();
	                            }
	                                break;
	                            }
	                            case 3: {
	                                int X;
	                                System.out.println("Nhap vao tong luong");
	                            int x = Integer.parseInt(sc.nextLine());
	                                System.out.println("THONG TIN KHACH HANG CO LUONG LON HON GIA TRI VUA NHAP :");
	                                for(int i=0;i<danhsach.size();i++) {
	                                if (x>=danhsach.get(i).getTongluong()) {
	                                danhsach.get (i).HienThiTT();
	                            }
	                                
	                                }
	                                break;
	                            }
	                            case 4 : {
	                                break;
	                            }
	                        }
	                }while(luachon!=4);
	    }
	}

