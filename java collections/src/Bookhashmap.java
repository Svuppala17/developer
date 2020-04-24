import java.util.HashMap;
import java.util.Map;

class booking{
	int pageno;
	int quantity;
	String author;
	public booking(int pageno,int quantity,String author){
this.author=author;
this.pageno=pageno;
this.quantity=quantity;
	}
}
public class Bookhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creted a map //
HashMap<Integer,booking> map= new HashMap<Integer,booking>();
//creted a books //
booking b1= new booking(101,8,"satish\t");
booking b2= new booking(102,4,"rajish\t");
booking b3= new booking(103,6,"sushma\t");

///adding books to map//

map.put(1, b1);
map.put(2, b2);
map.put(3,b3);

//trversing in map
for(Map.Entry<Integer, booking> entry:map.entrySet()) {
int key =entry.getKey();// we creted a local variable to get key value//
booking b=entry.getValue();//creted a local cafiable B to get the getvalue//
System.out.println(key+" "+"deatils:");
System.out.println(b.author+" "+b.pageno+" "+ b.quantity);

}




		
	}

}
