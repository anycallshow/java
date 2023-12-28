package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractic {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.print("양수만 입력해주세요.");
		} else if (num % 2 != 0 ) {
			System.out.print("홀수입니다.");
		} else {
			if(num == 0) {
				System.out.print("0 입니다.");
			}else
			System.out.print("짝수입니다.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();
		
		if(num1 < 40 && num2 < 40 && num3 < 40 || ((num1+num2+num3)/3 < 60) ) {
			System.out.print("불합격입니다.");
		}else {
			System.out.println("국어 : " + num1);
			System.out.println("수학 : " + num2);
			System.out.println("영어 : " + num3);
			System.out.printf("합계 : %d\n", + (num1+num2+num3));
			System.out.printf("평균 : %.1f\n", + ((num1+num2+num3)/3.0));
			System.out.println("축하합니다, 합격입니다!");
			
		}
			
		}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		String str; 
		
		switch(month) { 
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : str = "월은 31일까지 있습니다."; break;
		case 4 : case 6 : case 9 : case 11 : str = "월은 30일 까지 있습니다."; break;
		case 2 : str = "월은 28일 까지 있습니다."; break;
		default : str = "월은 잘못 입력된 달입니다." ; break;
		}
		System.out.println(month + str);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if (bmi < 18.5) {
			System.out.print("저체중");
		}else if(bmi < 23 ) {
			System.out.print("정상체중");
		}else if(bmi < 25) {
			System.out.print("과체중");
		}else if(bmi < 30) {
			System.out.print("비만");
		}else {
			System.out.print("고도 비만");
		}
		
	}
	public void practice5() {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int num3 = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int num4 = sc.nextInt();
		
		double result1 = num1 * 0.2;
		double result2 = num2 * 0.3;
		double result3 = num3 * 0.3;
		double result4 = num4 * 5 * 0.2;
		
		double total = result1 + result2 + result3+ result4;
		
		System.out.println("======================결과===================");
		
		if (result4 < 14) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)", num4);
		}else if(total < 70) {
			System.out.println("중간 고사 점수(20) :" + result1);
			System.out.println("기말 고사 점수(30) :" + result2);
			System.out.println("과제 점수     (30):" + result3);
			System.out.println("출석 점수     (20):" + result4);
			System.out.println("총점 : " + total);
			System.out.println("Fail [점수 미달]");
		}else {
			System.out.println("중간 고사 점수(20) :" + result1);
			System.out.println("기말 고사 점수(30) :" + result2);
			System.out.println("과제 점수     (30):" + result3);
			System.out.println("출석 점수     (20):" + result4);
			System.out.println("총점 : " + total);
			System.out.println("PASS"); */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double homework = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		double attendance = sc.nextDouble();
		
		if(attendance <= 20 * (1 - 0.3)) { // 30% 이상 결석 <-> 70% 미만 출석
			System.out.println("Fail [출석 횟수 부족("+ (int)attendance +"/20)]");
			
		} else {
			midTerm *= 0.2; 
			finalTerm *= 0.3;
			homework *= 0.3;
			attendance *= 5 * 0.2;
			
			// 합계 
			double sum = midTerm + finalTerm + homework + attendance;
			System.out.println("====================== 결과 ===================");
			System.out.printf("중간 고사 점수(20) : %.1f\n", midTerm);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTerm);
			System.out.printf("과제 점수(30) : %.1f\n", homework);
			System.out.printf("출석 횟수(20) : %.1f\n", attendance);
			System.out.printf("총점 : %.1f\n", sum);
			
			if(sum >= 70) { 
				System.out.println("PASS"); 
			}else {
				System.out.println("Fail [점수 미달]"); 
			}
		}
		
		
		
	}
		
		
		
		
		
		
}


