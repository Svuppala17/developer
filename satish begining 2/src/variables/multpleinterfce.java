package variables;
interface printable{
	void run();

}

interface removable{
	void show();

}



class multpleinterfce  implements printable,removable{
public void run() {
	System.out.println("hello");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		multpleinterfce a = new multpleinterfce();
    a.run();
    a.show();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("world");
	}

}
