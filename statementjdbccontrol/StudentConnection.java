package statementjdbccontrol;

import statementjdbcservice.StudentService;

public class StudentConnection {

	public static void main(String[] args) throws Exception {
		
		StudentService ss = new StudentService();

//		ss.insert();
		
//		ss.update();
		
		ss.delete();
	}

}
