import java.util.HashMap;
import java.util.Map.Entry;

public class array {
int num[];

public static void main(String args[]) {
	
HashMap<Integer,String> hm= new HashMap<Integer,String>();
hm.put(1, "raja");
hm.put(2,"satish");

for(Entry<Integer, String> a:hm.entrySet()) {
	System.out.println(a.getValue()+" "+a.getKey());
}	
   }   
}
