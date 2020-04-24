package variables;

public class arraymethd {

	public static void min(int a[]) {
		int min =a[0];// declaring
		for(int i=1;i<a.length;i++)//for loop condition
			
			if(min>a[i]) 
				min=a[i];
		
		System.out.println(min);
	}
	
	
	
	
	public static void main(String[] args) {
		int[] a= {33,2,3,2,1,4,6};
// TODO Auto-generated method stub
min(a);
	}

}
