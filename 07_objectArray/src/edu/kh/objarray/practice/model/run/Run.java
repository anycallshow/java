package edu.kh.objarray.practice.model.run;

import edu.kh.objarray.practice.model.service.EmployeeService;
import edu.kh.objarray.practice.model.service.PracticeService;

public class Run {
	public static void main(String[] args) {
		PracticeService service = new PracticeService();
		
		service.start();
		
		
		EmployeeService serv = new EmployeeService();
		
//		serv.displayMenu();
	}
}
