package edu.kh.objarray.practice.model.service;

import java.util.Scanner;

import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {

	private Employee[] employees = new Employee[3]; // 사원 정보를 저장할 Employee 배열
	private Scanner sc = new Scanner(System.in); 
	private Employee information = null; 


	public void displayMenu() { // 메인메뉴 메소드

		int sel = 0;

		do {

			System.out.println("=== 직원 관리 프로그램 ===");
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, 부서, 급여 출력");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1: initEmployee(); break;
			case 2: System.out.println( allEmployeesInformation() ); break;
			case 3: System.out.println(searchEmployee()); break;
			case 4: System.out.println( salaryCheck() ); break;
			case 5: allSalaryCheck(); break;
			case 6: topSalaryEmployee(); break;
			case 0: System.out.println("프로그램 종료."); break;

			default: System.out.println("잘못 입력하셨습니다.");
			}

		}while(sel != 0);

	}

	// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
	public void initEmployee() { // 1번
		// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
		for (int i = 0; i < employees.length; i++) {
			System.out.println("=== " + (i+1) + "번째 사원 정보 입력 ===" );

			System.out.print("사번 : ");
			int num = sc.nextInt(); sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("부서 : ");
			String department = sc.next();

			System.out.print("직급 : ");
			String rank = sc.next();

			System.out.print("급여 : ");
			int pay = sc.nextInt(); sc.nextLine();

			employees[i] = new Employee(num, name, department, rank, pay);


		}
	}


	// 모든 직원 정보를 하나의 문자열로 반환
	public String allEmployeesInformation() { // 2번

		String str = "";

		for (int i = 0; i < employees.length; i++) {
			information = employees[i];

			str += "사번 : " + information.getNum() + ", 이름 : " + information.getName() + ", 부서 : "
					+ information.getDepartment() + ", 직급 : " + information.getRank() + ", 급여 : " + information.getPay()+"\n";
		}
		return str;
	}

	// 특정 사원 정보 반환 메소드(이름 검색)
	// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
	public String searchEmployee() { // 3번

		System.out.println("=== 특정 사원 정보 출력(이름 검색) ===");
		System.out.print("이름 입력 : ");
		String input = sc.next();
		boolean flag = true; 
		String str = "";

		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getName().equals(input)) {
				flag = false;
				str = "사번 : " + employees[i].getNum() + ", 이름 : " + employees[i].getName() + ", 부서 : "
						+ employees[i].getDepartment() + ", 직급 : " + employees[i].getRank() + ", 급여 : " + employees[i].getPay()+"\n";
			}
		}
		// 4) 검색 결과가 없을 경우 "일치하는 검색 결과가 없습니다." 출력 
		if(flag) {
			str = "일치하는 이름의 사원이 없습니다.";
		}
		return str;
	}


	// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
	// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
	public String salaryCheck() { // 4번

		System.out.println("=== 급여/연봉 조회 ===");
		System.out.print("사번 입력 : ");
		int input = sc.nextInt(); 

		boolean flag = true; 
		String str = "";

		for (int i = 0; i < employees.length; i++) {

			if(employees[i].getNum() == input) {
				flag = false;
				str = "급여 : " + employees[i].getPay() + 
						" / 연봉 : " + (employees[i].getPay()*12);
			}
		}
		// 4) 검색 결과가 없을 경우 "일치하는 검색 결과가 없습니다." 출력 
		if(flag) {
			str = "사번이 일치하는 직원이 없습니다.";
		}
		return str;
	}


	// 모든 사원 급여 합/연봉 합 출력
	public void allSalaryCheck() { // 5번

		System.out.println("=== 모든 사원 급여 합/연봉 합 ===");

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < employees.length; i++) {

			sum1 += employees[i].getPay(); 
			sum2 += (employees[i].getPay()*12); 
		}
		System.out.println("전 직원 급여 합 : " + sum1);
		System.out.println("전 직원 연봉 합 : " + sum2);
		System.out.println();



	}

	// 모든 직원중 급여가 가장 높은 직원 출력
	// (동일한 급여인 경우 사번이 낮은 사람이 출력)
	public void topSalaryEmployee() { // 6번

		int max = employees[0].getPay();
		
		// 최고 급여 찾기 
		for (int i = 0; i < employees.length; i++) {
			
			if(employees[i].getPay() > max ) {
				max = employees[i].getPay();
			}
		}
		
		// 급여가 가장 높은 직원 이름, 부서, 급여 출력 
		for (int i = 0; i < employees.length; i++) {
			
			if(max == employees[i].getPay()) {
				System.out.println("이름 : " + employees[i].getName()+", 부서 : "
						+ employees[i].getDepartment() + ", 급여 : " + employees[i].getPay());
			}
		}
		




	}

}
