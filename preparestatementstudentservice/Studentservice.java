package preparestatementstudentservice;

import preparestatementjdbc.*;

public class Studentservice {

	public void indata() throws Exception {
		
		Studentdao sd = new Studentdao();
		
//		sd.insertdata();
//		sd.updatedata();
//		sd.deletedata();
		sd.getalledata();
		
		}
	
}
