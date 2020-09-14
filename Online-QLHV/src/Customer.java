import java.util.Scanner;

/**
 * @author MSI_
 *
 */
public class Customer extends Person {

	//1.Attributes
	private String tenCongTy;
	private float triGiaHoaDon;
	private String danhGia;
	
	//2.Get set methods
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	//3. Constructors
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hoTen
	 * @param diaChi
	 * @param ma
	 * @param email
	 */
	public Customer(String hoTen, String diaChi, String ma, String email, String tenCty, float triGia, String _danhGia) {
		super(hoTen, diaChi, ma, email);
		this.tenCongTy = tenCty;
		this.triGiaHoaDon = triGia;
		this.danhGia = _danhGia;
	}
	//4. I/O methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Enter name of Company: ");
		this.tenCongTy = scan.nextLine();
		
		System.out.println("Enter the invoice value: ");
		this.triGiaHoaDon = Float.parseFloat(scan.nextLine());
		
		System.out.println("Enter the review: ");
		this.danhGia = scan.nextLine();
	}
	
	@Override 
	public void xuat() {
		super.xuat();
		System.out.println("\t Company's name: " + this.tenCongTy + 
						   "\t Invoice value: " + this.triGiaHoaDon +
						   "\t Review: " + this.danhGia);
		
	}
	//5. Business methods
}
