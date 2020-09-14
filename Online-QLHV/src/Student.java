import java.util.Scanner;

/**
 * mục đích: tạo lớp quản lý các Students Người tạo: CyberLearn Ngày tạo:
 * 5/9/2020 Version: 1.0
 */
public class Student extends Person {

	// 1. Attributes
	private float toan;
	private float ly;
	private float hoa;

	// 2. Get set methods

	public float getToan() {
		return toan;
	}

	public void setToan(float toan) {
		this.toan = toan;
	}

	public float getLy() {
		return ly;
	}

	public void setLy(float ly) {
		this.ly = ly;
	}

	public float getHoa() {
		return hoa;
	}

	public void setHoa(float hoa) {
		this.hoa = hoa;
	}

	// 3. Constructors
	public Student() {

	}

	public Student(String hoTen, String diaChi, String ma, String email, float toan, float ly, float hoa) {
		super(hoTen, diaChi, ma, email);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	// 4. I/O methods
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Math score: ");
		this.toan = Float.parseFloat(scan.nextLine());

		System.out.println("Physis score: ");
		this.ly = Float.parseFloat(scan.nextLine());

		System.out.println("Chemistry score: ");
		this.hoa = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Math: " + this.toan + "\t Physis: " + this.ly + "\t Chemistry: " + this.hoa);
	}

	// 5. Business methods
}
