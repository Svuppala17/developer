package javaruntime;

public class freetotalmemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runtime r= Runtime.getRuntime();
System.out.println("freel memory"+" "+r.freeMemory());
System.out.println("total memory"+" "+r.totalMemory());


for (int i=0;i<1000;i++) {
	new freetotalmemory();	
}
	
	System.out.println("after creating 10000"+" "+r.freeMemory());
	System.gc();
	System.out.println("sfter gc free memory"+" "+r.freeMemory());
	
	}

}
