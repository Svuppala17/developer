package variables;

class paracnstr{
	int id;
	String name;//a constructor which has different parametrs are called parametrized constr//
	
	paracnstr(int i,String n){
		id= i;
		name= n;
		
	}
	void display() {
		System.out.println(id +" "+name);
		
	}
	
	public static void main(String args[]) {
		paracnstr s1 = new paracnstr(111,"satish");
		paracnstr s2 = new paracnstr(222,"mae");
		s1.display();
		s2.display();
	}
}