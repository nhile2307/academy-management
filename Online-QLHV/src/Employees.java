import java.util.Scanner;

/**
 * Mục đích:
 * Ngày tạo:
 * Người tạo:
 * Version: 1.0
 */
public class Employees extends Person {

	//1.Attributes
	private float soNgayLamViec;
	private int luongTheoNgay;
	
	//2.Get set methods
	
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(int luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	//3.Constructors
	public Employees() {
		
	}

	/**
	 * @param hoTen
	 * @param diaChi
	 * @param ma
	 * @param email
	 */
	public Employees(String hoTen, String diaChi, String ma, String email, float soNgay, int luong) {
		super(hoTen, diaChi, ma, email);
		this.soNgayLamViec = soNgay;
		this.luongTheoNgay = luong;
	}
	//4. I/O methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Enter daily Salary: ");
		this.luongTheoNgay = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter number of Working day: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Salary/day: " + this.soNgayLamViec + "\t N.o Working day: " + this.soNgayLamViec); 
	}
	//5. Business methods
}
