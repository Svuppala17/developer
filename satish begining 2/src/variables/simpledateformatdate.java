package variables;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateformatdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date datenow= new Date(); 
//date is a conceret class we took from java.util//
SimpleDateFormat sdf= new SimpleDateFormat("yyyy.mm.dd 'at' hh:mm:ss a z");
//simpledteformat is a concerte class we brogut from java.util//

System.out.println("current date:"+""+sdf.format(datenow));///the above is hours:min:sec and zone time
	
	
	}

}
