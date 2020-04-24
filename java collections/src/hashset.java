import java.util.HashSet;
import java.util.*;
class books{
	int pageno;
	String author;
	String publisher;
books(int pageno,String author,String publisher){
	this.pageno= pageno;
	this.author=author;
	this.publisher=publisher;
}
}
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<books> ll= new HashSet<books>();
books b1=new books(101,"satish","r6wxon");
books b2= new books(102,"rajesh","gannex");
books b3 = new books(103,"ramesh","rex");

ll.add(b1);
ll.add(b2);
ll.add(b3);
	
for(books b:ll) {
	System.out.println(b1.author+b2.publisher+b3.pageno);
}
	}

}
