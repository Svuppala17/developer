package variables;

public class javaarraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char copyfrom[]= {'d','f','g','h','e','t','u'};
	
char copyto[] = new char[7];
System.arraycopy(copyfrom, 2, copyto, 1, 5);
//  this is the suntax for displaying the charscter//
System.out.println(new String(copyto));

	
	}
}
