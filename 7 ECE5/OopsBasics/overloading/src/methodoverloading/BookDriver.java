package methodoverloading;
  class Book{
	String bName;
	String author;
	double price;
	Book(){
		
	}
	Book(String bname,String author,double price){//constructor
		this.bName=bname;//this shows current object
		this.author=author;
		this.price=price;
	}
	public void bookDetails() {
		System.out.println(bName);
		System.out.println(author);
		System.out.println(price);
	}
}

public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Book b1 = new Book();
		b1.bookDetails();
		System.out.println("**********************************");
		Book b2 = new Book("java","likhitha",1000000);
		b2.bookDetails();		
	}

}
 


