import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class addallARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> al = new ArrayList<String>();

al.add("rajesh");

al.add("sajesh");

al.add("majesh");


ArrayList<String> alr = new ArrayList<String>();

alr.add("magam");
alr.add("niranjan");


al.addAll(alr);// adding the arraylist alr in al

java.util.Iterator<String> itr= al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}
}
