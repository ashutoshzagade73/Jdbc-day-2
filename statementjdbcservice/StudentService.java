package statementjdbcservice;

import Statementjdbc1.Studentdao;

public class StudentService {

	public void insert() throws Exception {

		Studentdao sd = new Studentdao();
		sd.insert();

	}

	public void update() throws Exception {

		Studentdao sd = new Studentdao();
		sd.update();
	}
	public void delete() throws Exception {

		Studentdao sd = new Studentdao();
		sd.delete();
}
}
