package edu.kh.objarray.practice.run;

import edu.kh.objarray.practice.model.service.EmployeeService;
import edu.kh.objarray.practice.model.service.PracticeService;

public class PracticeRun {

	public static void main(String[] args) {
		
		PracticeService service = new PracticeService();
		EmployeeService ser = new EmployeeService(); 
		
//		service.start();
		ser.displayMenu();

	}

}
