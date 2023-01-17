/**
 * 
 */
package week10;

/**
 * @author Le Huyen Trang
 *
 */
public class PhongBan {

	/**
	 * @param tenPhongBan, soNhanVien
	 */
	private String tenPhongBan;
	private byte soNhanVien;
	public static final byte SO_NV_MAX = 100;
	private NhanVien[] dsnv;
	
	public PhongBan(){
		
	}
	
	public PhongBan(String tenPhongBan, byte soNhanVien) {
		super();
		this.tenPhongBan = tenPhongBan;
		this.soNhanVien = soNhanVien;
		this.dsnv  = new NhanVien[SO_NV_MAX];
	}

	/**
	 * @return tenPhongBan
	 */
	public String getTenPhongBan() {
		return tenPhongBan;
	}

	/**
	 * @param tenPhongBan tenPhongBan to set
	 */
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	/**
	 * @return soNhanVien
	 */
	public byte getSoNhanVien() {
		return soNhanVien;
	}

	/**
	 * @param soNhanVien soNhanVien to set
	 */
	public void setSoNhanVien(byte soNhanVien) {
		this.soNhanVien = soNhanVien;
	}

	public boolean themNV(NhanVien nv) {
		if(soNhanVien<SO_NV_MAX) {
			dsnv[soNhanVien] = nv;
			soNhanVien ++;
			// System.out.print("Successfully!");
			return true;
		}
		return false;
	}
	
	//Xoa nhan vien vao sau cung
	public NhanVien xoaNV() {
		if (soNhanVien > 0) {
			NhanVien tmp = dsnv[soNhanVien - 1];
			dsnv[soNhanVien - 1] = null;
			soNhanVien --;
			return tmp;
		}
		else return null;
	}
	public void inTTin() {
		System.out.println("Thông tin của nhân viên trong phòng ban: "); 
		for (int i = 0; i<soNhanVien; i++) {
			dsnv[i].inTTin();		
		}
	}
	public double tongLuong(){
		double sum = 0;
		for (NhanVien nv : dsnv) {
			sum += nv.tinhLuong();		
		}
		return sum;
	}
	public static void main(String[] args) {
		// Cac nhan vien trong phong ban
		NhanVien s1 = new NhanVien("Nam",2000,1.5);
		NhanVien s2 = new NhanVien("Hùng",3000,2);
		byte b = Byte.parseByte("0");
		PhongBan p1 = new PhongBan("Phòng 1", b);
		
		// Them nhan vien vao phong ban 1
		p1.themNV(s1);
		p1.themNV(s2);
		// Xoa nhan vien vao phong ban 1
		p1.xoaNV();
		
		//In thong tin cac nhan vien 
		p1.inTTin();
	}

}
