import java.util.ArrayDeque;

public class arrayDEQUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> deque= new ArrayDeque<String>();
deque.offer("satish");
deque.offer("rajesh");//used to insert fixed element
deque.add("mahesh");
deque.offerFirst("sushma");// offered at 1st place
System.out.println("\t elements which are offered");
for(String s:deque) {
System.out.println(s);
}
//now using poll- which is used to remove the head of the deque//

deque.pollLast();//which removed the end of the deque
deque.pollFirst();//whic remove the head of the deque which is1st//
System.out.println("\t after polllast elemnts are below");

for(String s:deque) {
	System.out.println(s);
}
	
	
	
	}

}
