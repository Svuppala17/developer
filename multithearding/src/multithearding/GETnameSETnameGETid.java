package multithearding;

public class GETnameSETnameGETid extends Thread {
	public void run() {
		System.out.println("riunning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GETnameSETnameGETid j1 = new GETnameSETnameGETid();
		GETnameSETnameGETid j2 = new GETnameSETnameGETid();
		GETnameSETnameGETid j3 = new GETnameSETnameGETid();

		System.out.println("name oof t1" + " " + j1.getName());
		System.out.println("name of t2" + " " + j2.getName());
		System.out.println("name of id" + " " + j3.getId());
		j1.start();
		j2.start();

		j1.setName("alhabad");
		System.out.println("after changing " + j1.getName());
	}

}
