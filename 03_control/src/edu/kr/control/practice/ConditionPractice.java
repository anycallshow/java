package edu.kr.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		// 키보드로 입력 받은 정수가 양수이면서 짝수일 때만 "짝수입니다."를 출력하고
		// 짝수가 아니면 "홀수입니다."를 출력하세요
		// 양수가 아니면 "양수만 입력해주세요." 를 출력하세요.		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num<0) { 
			result = "양수만 입력해주세요.";
		}else if(num%2 == 1) {
			result = "홀수 입니다.";
		}else {
			result = "짝수입니다.";
		}
		System.out.println(result);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avr = sum / 3;
		
		if(kor>=40&&math>=40&&eng>=40&&avr>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n" , avr);
			
			System.out.println("축하합니다, 합격입니다!");
						
		}else {
			System.out.println("불합격 입니다.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 :case 7 :case 8 :
		case 10 : case 12 : System.out.printf("%d월은 31일까지 있습니다.\n", month); break;
		
		case 2 : case 4 : case 6 :case 9 :case 11 :
		System.out.printf("%d월은 30일까지 있습니다.\n", month); break;
		
		default : System.out.printf("%d월은 잘못 입력된 달입니다.\n", month); break;
			
		
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 :");
		double hi = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 :");
		double we = sc.nextDouble();
		
		double bmi = we / (hi*hi);
		
		System.out.println("BMI 지수 : " + bmi);
		
		String result;
		
		if(bmi>=30) {
			result = "고도 비만";
		}else if(bmi >= 25) {
			result = "비만";
		}else if(bmi >= 23) {
			result = "과체중";
		}else if(bmi >= 18.5) {
			result = "정상체중";
		}else {
			result = "저체중";
		}
		System.out.println(result);
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int semi = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int rep = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int ate = sc.nextInt();
		
		double semiSco = semi * 0.2;
		double finSco = fin * 0.3;
		double repSco = rep * 0.3;
		double ateSco = ate * 5 * 0.2;
		
		int ateSco2 = (int)ateSco;
		
		double sum = semiSco + finSco + repSco + ateSco;
		
		System.out.println("=========== 결과 ===========");
		
		if(ate < (20*0.7)) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]\n", ateSco2); 
			
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", semiSco );
			System.out.printf("기말 고사 점수(30) : %.1f\n", finSco );
			System.out.printf("과제 점수   (30) : %.1f\n", repSco );
			System.out.printf("출석 점수   (20) : %.1f\n", ateSco );
			System.out.printf("총점 : %.1f\n", sum );
			
			if(sum>=70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
		}
			
	}
		
		
	

	
}

	
	

