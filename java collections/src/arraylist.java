import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
	
	al.add("ravi");
		al.add("satish");
		al.add("rajesh");
		al.add("rajeshsss");
<<<<<<< HEAD
		al.add("rajeshsss");
=======
		
>>>>>>> 7ad4c0558382f53b9a10404630f8c49691845495
		Iterator<String> itr = al.iterator();
		//when ever we use this itertor
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());//
		//every time when u call the nxt it pull thr string //
		
}
}