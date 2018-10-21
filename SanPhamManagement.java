package BaiTap;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class SanPhamManagement {
	Vector list = new Vector(); 
	public  SanPhamManagement () {
	
		while(true) {
			System.out.println(" Quan ly San Pham: " );
			System.out.println(" 1. Nhap San Pham. " );
			System.out.println(" 2. In San Pham." );
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println(" Moi ban chon chuc nang ");
			n = key.nextInt();
			switch (n) {
			   case 1: NhapTT(); break;
			   case 2: InTT(); break;
			  
			   
			 
			}
		}
	}
    public void NhapTT() {
    	Scanner key= new Scanner (System.in);
    	int n;

    	System.out.print(" Nhap so luong san pham = ");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) { 
			System.out.print(" Nhap loai san pham = ");
		    String loaisanpham=key.nextLine();
			System.out.print(" Nhap ten san pham = ");
			String tensanpham=key.nextLine();
			System.out.print(" Nhap gia san pham: ");
			Double gia=Double.parseDouble(key.nextLine());
			System.out.print("Nhap so luong: ");
			int soluong=Integer.parseInt(key.nextLine());
			SanPham b = new SanPham(loaisanpham,tensanpham,gia,soluong);
			list.add(b);
		}	
		
		}
		public void InTT() {
			Enumeration sanpham= list.elements();
			int i=1;
			while(sanpham.hasMoreElements()) {
				SanPham sp = (SanPham)sanpham.nextElement();
				System.out.println("Ma San pham ="+sp.getLoaisanpham()+" va ten san pham la "+sp.getTensanpham());
			}
		}
		
		public static void main(String[] args) {
			new SanPhamManagement();
		}
		

	}
    


