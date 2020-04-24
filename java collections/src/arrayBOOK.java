import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

class BOOK {

	int id;
	String name,author;
	int qunatity;
	
	public BOOK(int id,String name, String author, int qunatity) {
	
		this.id=id;
		this.name=name;
		this.author=author;
		this.qunatity=qunatity;	
	}	
}
public class arrayBOOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<BOOK> list= new ArrayList<BOOK>();		

BOOK b1= new BOOK(6,"satish","hik",9);
BOOK b2= new BOOK(6,"datnnish","lik",99);
BOOK b3= new BOOK(6,"satihhhhhsh","hllik",900);
BOOK b4= new BOOK(6,"samjjtish","ouihik",79);
BOOK b5= new BOOK(6,"rajesh","ouihik",89);
list.add(b1);
list.add(b2);
list.add(b3);
list.add(b4);
list.add(b5);
for(BOOK b:list) {
System.out.println(b.author+" "+b.name+" "+b.id+" "+b.qunatity);
	}
  }
}
