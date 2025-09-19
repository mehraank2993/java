package menu_driven;
import java.util.*;
class Book{
	private String title;
	private String author;
	private String isbn;
	public Book(String title,String author,String isbn) {
		this.author=author;
		this.title=title;
		this.isbn=isbn;
	}
	public String gettitle() {
		return title;
	}
	
	public String getauthor() {
		return author;
	}
	public String getisbn() {
		return isbn;
	}
	public void details() {
		System.out.println(title +" "+author+" "+isbn);
	}
	
}
class library{
	private ArrayList<Book> list=new ArrayList<>();
	public void addbook(Book book) {
		list.add(book);
	}
	public void removebook(String isbn) {
		if(list.isEmpty()) {
			System.out.println("library is empty");
		}
		else {
			for (Book b:list) {
				if(b.getisbn().equals(isbn)) {
					list.remove(b);
					System.out.println("Book removed");
				}
				else {
					System.out.println("book not found");
				}
				
			}
		}
	}
	public void searchbook(String title) {
		if(list.isEmpty()) {
			System.out.println("library is empty");
		}
		else {
			for (Book b:list) {
				if(b.gettitle().equalsIgnoreCase(title)) {
					b.details();
				}
				else {
					System.out.println("book not found");
				}
				
			}
		}
	}
	public void displayall() {
		if(list.isEmpty()) {
			System.out.println("book not found");
		}
		else {
			for(Book b:list) {
				b.details();
			}
		}
	}
}

public class LManagement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		library lib = new library();
		int choice;
		
		while(true) {
		System.out.println("\n Library");
		System.out.println("1: addbook");
		System.out.println("2: removebook");
		System.out.println("3: searchbook");
		System.out.println("4: Display all");
		System.out.println("5: exit");
		choice = sc.nextInt();
		sc.nextLine();
		
		
			
			switch (choice){
				case 1:
					System.out.println("enter the title");
					String newtitle = sc.nextLine();
					System.out.println("enter the author");
					String newauthor = sc.nextLine();
					System.out.println("enter the isbn");
					String newisbn = sc.nextLine();
					lib.addbook(new Book (newtitle,newauthor,newisbn));
					break;
				case 2:
					System.out.println("enter the isbn");
					String removeisbn=sc.nextLine();
					lib.removebook(removeisbn);
					break;
				case 3:
					System.out.println("enter the title");
					String search =sc.nextLine();
					lib.searchbook(search);
					break;
				case 4:
					System.out.println("enter the title");
					String dbook = sc.nextLine();
					lib.displayall();
					break;
				case 5:
					System.out.println("Exiting");
					sc.close();
					return;
				default:
					System.out.println("invalid choice");
				}
		}
		
		


	}

}
