package BaiTap;

public class SanPham {
	String loaisanpham;
	String tensanpham;
	double gia;
	int soluong;
	public String getLoaisanpham() {
		return loaisanpham;
	}
	public void setLoaisanpham(String loaisanpham) {
		this.loaisanpham = loaisanpham;
	}
	public String getTensanpham() {
		return tensanpham;
	}
	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public SanPham() {
		
	}
	public SanPham(String loaisanpham, String tensanpham, double gia, int soluong) {
		this.loaisanpham = loaisanpham ;
		this.tensanpham = tensanpham ;
		this.gia = gia ;
		this.soluong = soluong ;
		
	}
	
	

}
