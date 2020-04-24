import java.util.regex.*;
public class characterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Pattern.matches("[amn]", "n"));//either it shuld be a m n
System.out.println(Pattern.matches("[^amn]", "n"));	// it should be any charcter except amn	
System.out.println(Pattern.matches("[a-mA-M]", "m"));// it should be between a-m 
System.out.println(Pattern.matches("[a-m[n-p]]", "p"));// the charcter should be  between a-m or n-p 		
System.out.println(Pattern.matches("[a-z&&[nop]]", "n"));// in total char from a-z it should be eigther n or o or p// 
System.out.println(Pattern.matches("[a-z[^np]]", "b"));// from a-z the char should not be n or p 	
System.out.println(Pattern.matches("[a-z&&[^m-p]]", "b"));// char should be a-z not m-p 	
	}

}
//note: This is the concpt  above that if 
// give any character as input ie A OR M OR N 
//THEN it shows true if you give any other charcters 
//then it shows FALSE 
