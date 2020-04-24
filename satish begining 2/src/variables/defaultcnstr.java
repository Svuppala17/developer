package variables;

public class defaultcnstr {
	int a;
	String name;
	
public void display() {
	System.out.println(a + "" +name);
}
	
	public static void main (String args[]) {
		defaultcnstr s1 = new defaultcnstr();
		defaultcnstr s2 = new defaultcnstr();
		s1.display();
		s2.display();
		
		
	}

}
