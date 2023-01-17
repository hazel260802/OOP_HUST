package week10;

public class NhanVien {
	// TODO Auto-generated method stub
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public final double LUONG_MAX = 200000000;

	public double tinhLuong(){
		return luongCoBan * heSoLuong;
	}
	
	public boolean tangLuong(double amount) {
		this.heSoLuong += amount;
		if (tinhLuong() > LUONG_MAX) {
			this.heSoLuong -= amount;
			return false;
		}
		return true;
	}
	public void inTTin() {
		System.out.println(
				"Tên: " + tenNhanVien + ", " + 
				"Lương: " + luongCoBan);
	}
	
	public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong){
		this.tenNhanVien = tenNhanVien;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}
	public String getTen() {
		return tenNhanVien;
	}
	public void setTen(String tenNhanVien){
		this.tenNhanVien = tenNhanVien;
	}
	public double getHeSo() {
		return heSoLuong;
	}
	public void seHeSo(double heSoLuong){
		this.heSoLuong = heSoLuong;
	}

	public static void main(String[] args) {
		NhanVien s1 = new NhanVien("Nam",2000,1.5);
		NhanVien s2 = new NhanVien("Hùng",3000,2);
		
		// Kiểm tra hàm tăng lương
		System.out.println("Nhan viên " + s1.tenNhanVien + " có được tăng lương: " + s1.tangLuong(3));
		System.out.println("Nhan viên " + s1.tenNhanVien + " có được tăng lương: " + s2.tangLuong(10000000));	
		// Kiểm tra các hàm getter & setter
		s1.setTen("Vinh");
		System.out.println("Nhan viên hiện tại: " + s1.getTen()+ ", " + s2.getTen());
		// In thông tin của các nhân viên
		System.out.println("Thông tin của nhân viên:");
		s1.inTTin();
		s2.inTTin();	
	}
}
