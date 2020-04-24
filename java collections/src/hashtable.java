import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(100, "satish");
hm.put(102, "rajesh");
hm.put(103, "sushma");
hm.put(104, "srinivas");

for(Map.Entry m:hm.entrySet()) {
	System.out.println(m.getValue()+" "+m.getKey());
}
		
		
	}

}
