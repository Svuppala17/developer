package variables;

public class thiss {
int a;
int b;// instant variable
void setdata(int a,int b){
this.a=a;// local variable
this.b=b;
}
void showdata() {
	System.out.println("value of a" +a);
	System.out.println("value of b"+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thiss obj = new thiss();
obj.setdata(1, 2);
obj.showdata();
	}

}
