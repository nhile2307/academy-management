import java.util.Scanner;

/*
 * Mụch đích: quản lý các loại Student, Employee, Customer ở mức cha
 * Ngày tạo: 5/9/2020
 * Người tạo: CyberLearn
 * Version: 1.0
 */
public class Person {
	//1. Attributes
	protected String hoTen;
	protected String diaChi;
	protected String ma;
	protected String email;

	//2. Get set methods	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//3. Construtors
	public Person() {
		
	}

	public Person(String hoTen, String diaChi, String ma, String email) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ma = ma;
		this.email = email;
	}
	
	//4. I/O methods
	public void nhap(Scanner scan) {
		System.out.print("Enter full Name: ");
		this.hoTen = scan.nextLine();
		
		System.out.print("Enter address: ");
		this.diaChi = scan.nextLine();

		System.out.print("Enter code: ");
		this.ma = scan.nextLine();
		
		System.out.print("Enter email: ");
		this.email = scan.nextLine();
		
	}
	
	public void xuat() {
		System.out.print("Full Name: " + this.hoTen + "\t" + 
						 "Code: " + this.ma + "\t" +
						 "Address: " + this.diaChi + "\t" + 
						 "Email: " + this.email );
	}
	//5. Business methods
	

}
