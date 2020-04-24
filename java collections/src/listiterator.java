import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al= new ArrayList<String>();
al.add("satish");
al.add("rajesh");
al.add("manasa");
System.out.println("second position"+" "+al.get(2));
ListIterator<String> itr =al.listIterator();
	
System.out.println("trasvering the elememts in frwrd direction");
while(itr.hasNext()) {
	System.out.println(itr.next());
}

System.out.println("trasvering in reverse direction");
while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}

	  }
	}

