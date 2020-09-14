import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);  

	}
	private static void inMenu() {
		System.out.println("Choose the selection : ");
		System.out.println("1. Add person");
		System.out.println("2. Delete by code");
		System.out.println("3. Sort by Name");
		System.out.println("4. Print the List");
		System.out.println("0. Exit");

	}
	
	private static void doMenu(Scanner scan) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		objListPerson.dummyData();
		do {
			inMenu();
			System.out.println("Please choose");
			int chon = Integer.parseInt(scan.nextLine());
			switch(chon) {
			case 1:
				objListPerson.nhap(scan);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				objListPerson.sortName();
				objListPerson.xuat();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Choose from 0-4");
			}
		}while(flag);
	}
}
