//notes:
// array is the collection of type of elements that has memory location//
//array is the object contains DATA TYPES//
//in this we length+ index+ and elements are sored in //
//indices and each index has to declare number ie //

// int-datatye, a[0]--refvar is 'a'+indice is LENGTH is '0'


//-------------------------------------------------------------------------->
package variables;

public class arrayjava {

	public static void main(String[] args) {
		//---->declartion= datatype[] arr; datatype []arr or datatype arr[];
		//--->instantiation= arrayrefvar= new datatype[size];
		//ie int a[0]=10;--> intialzation
int []a= new int[4];	// --> declartion and instantiation
a[0]=10;//refevar [length]= size;--->this is initilzation
a[1]=20;
a[2]=30;
a[3]=40;
	
//printing array//
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	
	
	}}
}