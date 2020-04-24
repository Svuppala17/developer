abstract class abstractclass{
	 abstract void run();
	
}
class honda extends abstractclass{
	void run() {
		System.out.println("ruuning safely");}
		public static void main(String args[]){
			abstractclass obj=new honda();
			obj.run();
		}
	}
