package variables;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] list= {1,2,3,4};
for(int i=0;i<list.length;i++) {
	System.out.println(list[i]);
}

int total = 0;
for(int totalvalue:list) {
}
System.out.println("total is"+ total);

int max= list[0];
for (int i = 1; i < list.length; i++) {
	if(list[i]>max)max=list[i];
	System.out.println("max is"+max);
}
}}