import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListPerson {
	//1.Attributes
	private ArrayList<Person> list;
	//2.Get set methods
	
	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}

	//3.Constructors
	public ListPerson() {
		list = new ArrayList<Person>();
	}

	//4.I/O methods
	private void inMenu() {
		System.out.println("Choose selection in the Menu");
		System.out.println("1. Insert Student");
		System.out.println("2. Insert Employee");
		System.out.println("3. Insert Customer");
		System.out.println("0. Exit");

	}
	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Please choose");
			int chon = Integer.parseInt(scan.nextLine());
			Person person;
			switch (chon) {
			case 1:
				person = new Student();
				person.nhap(scan);
				list.add(person);
				break;
			case 2:
				person = new Employees();
				person.nhap(scan);
				list.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				list.add(person);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập 0-3 mà thôi.");
			}
		}while(flag);
		
	}
	public void xuat() {
		for (Person person: this.list) {
			person.xuat();
		}
	}
	//5.Business methods
	public void dummyData() {
		Person person;
		person = new Student("John", "Olympiakatu", "1", "abc@gmail.com", 8, 4, 9);
		this.list.add(person);
		person = new Student("Marry", "Vuorikatu", "2", "daab@gmail.com", 5, 10, 9);
		this.list.add(person);
		
		person = new Employees("Nancy", "Pitkakatu", "3", "afafbc@gmail.com", 15, 20);
		this.list.add(person);
		person = new Employees("Nhi", "Valtakatu", "4", "abdddc@gmail.com", 20, 20);
		this.list.add(person);
		person = new Employees("Bill", "Raltakatu", "5", "aaaaabc@gmail.com", 30, 24);
		this.list.add(person);
		
		person = new Customer("Bin", "Opistokatu", "6", "abaaac@gmail.com", "CyberLearn", 20, "Good");
		this.list.add(person);
		person = new Customer("Henry", "Myllykatu", "7", "rrrrabc@gmail.com", "CyberSoft", 25, "Very Good");
		this.list.add(person);
		
	}

	private void interchangeSort(ArrayList<Person> _list) {
		int i;
		int j;
		for(i=0; i<_list.size()-1; i++) {
			for(j=i+1; j < _list.size(); j++) {
				Person personI = _list.get(i);
				Person personJ = _list.get(j);
				if(personJ.getHoTen().compareToIgnoreCase(personI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}
	
	public void sortName() {
		interchangeSort(this.list);
	}
}
