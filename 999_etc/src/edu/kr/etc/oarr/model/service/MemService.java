package edu.kr.etc.oarr.model.service;

import java.util.Scanner;

import edu.kr.etc.oarr.model.vo.Mem;

public class MemService {
	
	Scanner sc = new Scanner(System.in);
	
	private Mem memarr[] = new Mem[5];
	
	private Mem LoginInfo = null;
	
	public MemService() {}
	
	
	public void display() {
		
		int input = 10;
		
		do {
			
			System.out.println("===== 메뉴 선택 ======");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 정보 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 검색");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: break;
			default: break;
			
			}
			
		}while(input!=0);
		
	}
	
	
	
	
}
