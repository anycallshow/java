package edu.kr.op.practice;

import java.util.Scanner;

public class OpPractice {
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("1인당 사탕 개수 : %d\n" , (input2 / input1));
		System.out.printf("남는 사탕 개수 : %d\n" ,(input2 % input1));		
	}

	public void practice2() {
	    
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
	
	    System.out.print("학년 : ");
	    int i1 = sc.nextInt();
	
	    System.out.print("반 : ");
	    int i2 = sc.nextInt();

	    System.out.print("번 : ");
	    int i3 = sc.nextInt();

	    System.out.print("성별(남학생/여학생) : ");
	    String s1 = sc.next();
	    
	    System.out.print("성적 : ");
	    double d1 = sc.nextDouble();

	    System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f입니다.\n",  i1, i2, i3, name, s1, d1);
	}
	
	public void practice3() {
		
		//정수를 하나 입력 받아 짝수/홀수를 구분하세요.
		//0은 짝수로 취급합니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String str1 = "짝수 입니다.";
		String str2 = "홀수 입니다.";
				
		System.out.println( (input%2 == 1) ? str2 : str1 );
		
		//System.out.println( sc.nextInt()%2==1 ? "홀수" : "짝수" + " 입니다.");
				
	}
	
	public void practice4() {
		
		
		// 국영수 각 점수 40점 이상 , 평균 60이상 일 경우 합격 아니라면 불합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int score1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int score2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int score3 = sc.nextInt();
		
		int sum1 = score1 + score2 + score3;
		
		double average = sum1 / 3.0;
				
		System.out.println("합계 : " + sum1);
		
		System.out.printf("평균 : %.1f\n" , average);
		
		System.out.println((score1 >= 40)&&(score2 >= 40)&&(score3 >= 40)&&(average>=60) ? "합격" : "불합격");
		
	}
		
}

