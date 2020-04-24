import java.util.regex.*;
public class regexexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern p = Pattern.compile(".sd");//this is regex pattern
//if pattern is hving 
Matcher m = p.matcher("asd");// this should match the regex
		
boolean b = m.matches();// this is method which matches both the PATTERN @ MATCHER
boolean b1= Pattern.compile(".s").matcher("as").matches();
boolean b2 = Pattern.matches(".s", "as");

System.out.println(b+" "+b1+" "+b2);
		
	}

}
