package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice2 {
	
	public void practice1(){
//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 0 ) { 
			System.out.println("양수만 입력해주세요.");
			
		}else if(input % 2 == 0) {
			System.out.println("짝수입니다.");
			
		}else {
			System.out.println("홀수입니다");
		}
		
		
	}
	
	public void practice2(){
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		if(kor < 40 || math < 40 || eng < 40 || ((kor+math+eng)/3) < 60) {
			System.out.println("불합격입니다.");
			
		}else {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+(kor+math+eng));
			System.out.println("평균 : "+((kor+math+eng)/3.0));
			System.out.println("축하합니다, 합격입니다!");
		}
		
	}
	
	public void practice3(){
//		1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//		잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		
		
		case 1 : case 3 : case 4 : case 6 : case 8 : case 10: case 12 :
			System.out.println(input+"월은 31일까지 있습니다."); 
			break;
		case 5 : case 7 : case 9 : case 11 : 
			System.out.println(input+"월은 30일까지 있습니다");
			break;
		case 2 : 
			System.out.println(input+"월은 28일까지 있습니다.");
			break;
		default:
			System.out.println(input+"월은 잘못 입력된 달입니다.");
			break;
		}
		
	}
	
	 public void practice4(){
//		 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		 저체중/정상체중/과체중/비만을 출력하세요.
//		 BMI = 몸무게 / (키(m) * 키(m))
//		 BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		 BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		 BMI가 30이상일 경우 고도 비만
		 
		 
		 
	 }

}
