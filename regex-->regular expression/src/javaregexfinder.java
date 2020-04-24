import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Matcher;
public class javaregexfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner src= new Scanner(System.in);
 while(true) {
	 System.out.println("enetr regex pattern");
	 Pattern pattern=Pattern.compile(src.nextLine());
	 
	 System.out.println("enter text");
	 Matcher matcher=pattern.matcher(src.nextLine());
	  boolean a= false;
	 
	 while(matcher.find()) {//used to find next subsequence of input//
		 System.out.println("I found text"+" "+matcher.group()+" "+"starting at index"+" "+matcher.start()+" "+"ending at index"+" "+matcher.end());
	  a=true; //group() returns the input subseqnce matched by previous matcher//
	 //start() it shows the what is the strating index
	  //end() it shows what is the index is//
	 }
	 if(!a) {
		 System.out.println("no match found");
	 }
	 
 }
		
		}

}
