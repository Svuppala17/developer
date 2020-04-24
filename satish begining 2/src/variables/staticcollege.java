package variables;

public class staticcollege {
	int rollno;
	String name;
	static String college ;
	
	staticcollege(int i,String n){
	//if you use this constructor and int i,strng n??
		//then wen u create a obj to call method then you//
		//should declare the int i , string n in  below//
		rollno=i;
		 name=n;
		
	}
		void diplay() {
			System.out.println(rollno +   name   +   "ITE");
			
		}
	public static void main(String args[]) {
		staticcollege s1 = new staticcollege(111,"satish");
		s1.diplay();// Above you gave a value for int , string//
	}

}
