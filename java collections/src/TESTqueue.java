import java.util.Iterator;
import java.util.PriorityQueue;

public class TESTqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PriorityQueue<String> queue= new PriorityQueue<String>();
	
	queue.add("satish");
	queue.add("rajesh");
	queue.add("suresh");
	queue.add("mahesh");
	System.out.println("head"+"\t "+queue.element());//wnt remove head of queue
	System.out.println("head"+"\t "+queue.peek());////same as above but it shows null if you dnt have values//	
	
	Iterator<String> itr= queue.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	
queue.remove();//only use to remove head of the queue//
queue.poll();//remove head of the queue and show nullif element is empty //

System.out.println("showing after removing two elements\t");

Iterator<String> itr2= queue.iterator();
while(itr2.hasNext()) {
	System.out.println(itr2.next());
}




	}

}
