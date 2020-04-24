import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
		
	hm.put(105, "value");
	hm.put(101, "values");
	hm.put(100, "valuesss");
	hm.put(108, "valuesss");
	hm.put(100, "valuesss");

	
	hm.remove(100);///removing the object//
	
	
for(Map.Entry m:hm.entrySet()) {///trsversing the set values//

System.out.println(m.getValue()+" "+m.getKey());	
	
}
	}

}
