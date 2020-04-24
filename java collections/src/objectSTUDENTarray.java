import java.util.*;
public class objectSTUDENTarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
arraystudent s1= new arraystudent(101,"satish",23);
arraystudent s2= new arraystudent(102,"ratish",33);
arraystudent s3= new arraystudent(103,"matish",43);
	
ArrayList<arraystudent> al= new ArrayList<arraystudent>();
al.add(s1);
al.add(s2);
al.add(s3);

Iterator itr = al.iterator();
	while(itr.hasNext()) {
	arraystudent st=(arraystudent)itr.next();	
	
	
System.out.println(st.name+" "+st.rollno+" "+st.age);
		
		
	}	}

}
