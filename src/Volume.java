import java.util.Arrays;

public class Volume {
	private String volumeName;
	private short numberOfBooks;
	private Book [] book;
	
	public String toString() {
		return "Volume [volumeName=" + volumeName + ", numberOfBooks="
				+ numberOfBooks + ", book=" + Arrays.toString(book) + "]";
	}
	public Volume(){
		this.volumeName="";
		this.numberOfBooks=0;
		this.book= new Book[0];	
	}
	public Volume (String volumeName, int numberOfBooks, Book[] book){
		
		this.book=book;
		this.volumeName=volumeName;
		this.numberOfBooks=(short) numberOfBooks;
		
	}
	public String getBookArray(){
		String bookList="";
		for(Book b:book){
			bookList +=b+"\n";
		}
		return bookList;
	}
	
	public Book getBookArray(int numberOfBooks){
		return book[this.numberOfBooks];
	}
}
