import java.util.Scanner;
public class DemoVolume {
	
    public static void main (String[] args){
	
	Volume [] volume = null;
	Book [] book = null;
	Scanner kbd=new Scanner(System.in);
		
		System.out.println("How many books are you adding to the library today?");
		int count = kbd.nextInt();
		book= new Book[count];
		volume= new Volume[count];
		for(int i=1; i<=count;i++){
			System.out.println("Please enter title of book "+i+":");
			String title=kbd.next();
			System.out.println("Please enter the author;");
			String author = kbd.next();
			System.out.println("Please enter number of pages of book" +i+ ":");
			int numberOfPages= kbd.nextInt();
			book[i-1]= new Book(title,author,numberOfPages);
			System.out.println("Enter Volume name;");
			String volumeName=kbd.next();
			System.out.println("Enter Volume number;");
			int numberOfBooks=kbd.nextInt();
			volume[i-1]= new Volume (volumeName,numberOfBooks, book);
		}
		for(int p=0;p<count;p++){
		System.out.println(volume[p].getBookArray());
		}	
	}
}