package variables;

public class overloadingcnstr {
	
	int id;
	String name;
	int age;
	
	overloadingcnstr(int i,String n){
		 i= id;//////
		n = name;///// this are called parameters in constructor
	}
		overloadingcnstr(int i, String n, int b){
			id = i;
			name = n;
			age = b;
			
		}
		overloadingcnstr(overloadingcnstr s){
			id =s.id;
			name=s.name;
			age= s.age;
		}
		
		
	void display() {
		System.out.println(id +""+ name+""+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadingcnstr s1 = new overloadingcnstr(111,"satish",0);
		overloadingcnstr s2 = new overloadingcnstr(121,"mad", 121);
		
		overloadingcnstr s3 = new overloadingcnstr(s1);
		s1.display();
		s2.display();
		s3.display();
	}

}
